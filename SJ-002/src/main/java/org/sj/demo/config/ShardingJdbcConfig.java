//package org.sj.demo.config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
//import org.springframework.context.annotation.Bean;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//import java.util.Properties;
//
///**
// * TODO: Delete todo after editing description
// * created by Lz on 2023/12/2 10:20
// */
//public class ShardingJdbcConfig {
//    @Bean
//    public DataSource dataSource(SqlSessionFactory sqlSessionFactory) throws SQLException {
//        // 配置分库分表规则等...
//        // ...
//
//        Properties properties = new Properties();
//        // 设置其他 Sharding-JDBC 的配置...
//        // ...
//
//        return ShardingDataSourceFactory.createDataSource(dataSourceMap, shardingRuleConfig, properties);
//    }
//}
