package com.sw.config;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// 此注解用来排序，改变规则为最高位优先
@Order(Ordered.HIGHEST_PRECEDENCE)
// repository配置类
@Configuration
//  开启JPA事务管理
@EnableTransactionManagement(proxyTargetClass = true)
//  启用了JPA资源库并指定接口资源库的位置
@EnableJpaRepositories(basePackages = "com.**.repository")
//  自动扫描Entity实体类
@EntityScan(basePackages = "com.**.entity")
public class JpaConfiguration {

    @Bean
    PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor(){
        return new PersistenceExceptionTranslationPostProcessor();
    }

}
