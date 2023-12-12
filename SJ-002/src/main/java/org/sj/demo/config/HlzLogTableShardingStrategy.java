package org.sj.demo.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * log表的自定义分片策略
 * created by Lz on 2023/12/1 16:54
 */
public class HlzLogTableShardingStrategy implements PreciseShardingAlgorithm<Long> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        long defaultTableRowSize = 2L;
        if (preciseShardingValue.getValue() <= defaultTableRowSize) {
            return "hlzlog_x"; // 返回原始表名
        } else {
            // 返回新表名，例如 login_log_1, login_log_2, ...
            return "hlzlog_x_" + (preciseShardingValue.getValue() / defaultTableRowSize);
        }
    }
}
