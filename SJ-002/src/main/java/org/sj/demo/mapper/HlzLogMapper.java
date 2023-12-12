package org.sj.demo.mapper;

import org.sj.demo.entity.HlzLog;

import java.util.List;

/**
 * TODO: Delete todo after editing description
 * created by Lz on 2023/12/2 10:13
 */
public interface HlzLogMapper {

    int insert(HlzLog log);


    List<HlzLog> list();
}
