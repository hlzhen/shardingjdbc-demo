package org.sj.demo.service;


import org.sj.demo.entity.HlzLog;

import java.util.List;

/**
 * 日志服务类
 * created by Lz on 2023/12/1 17:13
 */
public interface HlzLogService {

    int save(HlzLog log);

    List<HlzLog> list();
}
