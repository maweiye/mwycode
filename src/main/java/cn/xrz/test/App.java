package cn.xrz.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XRZ
 * @date 2019-06-03
 * @Description :
 */
@SpringBootApplication
@RestController
public class App extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(App.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }


    @GetMapping("/")
    public String t(){
//          return "66678";
        return "Hello JenKins2!";

    }
}
