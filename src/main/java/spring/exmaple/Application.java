package spring.exmaple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//此注解用来标志它是一个spring boot应用
@SpringBootApplication
//此注解标注这个程序还是一个控制器
@RestController
public class Application {
//    @RequestMapping("/")
    @RequestMapping("/index")
    public String home() {
        return "hello1" ;
    }

    //主程序，将在应用启动时首先被执行
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
