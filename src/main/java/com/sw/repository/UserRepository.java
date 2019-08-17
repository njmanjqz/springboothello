package com.sw.repository;

import com.sw.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//使用此注解，将此接口定义为一个资源库，使他能被其他程序使用，并为其他程序提供存取数据库的功能
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
