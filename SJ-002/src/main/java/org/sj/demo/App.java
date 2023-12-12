package org.sj.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO: Delete todo after editing description
 * created by Lz on 2023/12/2 10:11
 */
@SpringBootApplication
@MapperScan("org.sj.demo.mapper")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
