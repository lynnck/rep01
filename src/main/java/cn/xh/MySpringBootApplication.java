package cn.xh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: heima_java
 * @description: 启动类
 * @author: luyn
 * @create: 2019-06-17 19:33
 **/
@SpringBootApplication
@MapperScan("cn.xh.dao")
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);
    }
}
