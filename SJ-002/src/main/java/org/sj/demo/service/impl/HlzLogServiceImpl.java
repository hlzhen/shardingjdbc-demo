package org.sj.demo.service.impl;

import org.sj.demo.entity.HlzLog;
import org.sj.demo.mapper.HlzLogMapper;
import org.sj.demo.service.HlzLogService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 日志服务实现类
 * created by Lz on 2023/12/1 17:13
 */
@Service
public class HlzLogServiceImpl implements HlzLogService {

    private final HlzLogMapper mapper;

    public HlzLogServiceImpl(HlzLogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int save(HlzLog log) {
        return mapper.insert(log);
    }

    @Override
    public List<HlzLog> list() {
        return mapper.list();
    }
}
