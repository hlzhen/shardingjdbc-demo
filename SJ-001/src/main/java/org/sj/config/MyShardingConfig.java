package org.sj.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shardingsphere.api.config.sharding.KeyGeneratorConfiguration;
import org.apache.shardingsphere.api.config.sharding.ShardingRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.TableRuleConfiguration;
import org.apache.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;

/**
 * 动态配置
 * 1、定义数据源
 * created by Lz on 2023/12/6 16:41
 */
@Configuration
public class MyShardingConfig {


    /**
     * 定义数据源
     * @return 数据源集合
     */
    public Map<String, DataSource> createDatasourceMap() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/huanglz?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        // 测试菜单标记
        Map<String, DataSource> dataSourceMap = new java.util.HashMap<>();
        dataSourceMap.put("ds0", dataSource);
        return dataSourceMap;
    }

    /**
     * 定义分片表以及分片ID生成策略
     * @return
     */
    public TableRuleConfiguration getTableRuleConfiguration() {
        TableRuleConfiguration tableRuleConfiguration = new TableRuleConfiguration("t_order", "ds0.t_order_$->{1..2}");
        tableRuleConfiguration.setKeyGeneratorConfig(new KeyGeneratorConfiguration("SNOWFLAKE", "order_id"));
        return tableRuleConfiguration;
    }

    @Bean
    public DataSource getShardingDataSource() throws SQLException {
        ShardingRuleConfiguration shardingRuleConfiguration = new ShardingRuleConfiguration();
        shardingRuleConfiguration.getTableRuleConfigs().add(getTableRuleConfiguration());

        Properties properties = new Properties();
        properties.put("sql.show", "true");
        return ShardingDataSourceFactory.createDataSource(createDatasourceMap(), shardingRuleConfiguration, properties);

    }


}
