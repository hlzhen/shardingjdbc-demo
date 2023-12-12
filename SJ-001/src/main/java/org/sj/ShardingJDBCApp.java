package org.sj;

import org.apache.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ShardingJDBC 自定义分片策略
 * created by Lz on 2023/12/1 16:05
 */
@SpringBootApplication(exclude = {SpringBootConfiguration.class})
@MapperScan("org.sj.dao")
public class ShardingJDBCApp {
    public static void main(String[] args) {
        SpringApplication.run(ShardingJDBCApp.class, args);
    }
}