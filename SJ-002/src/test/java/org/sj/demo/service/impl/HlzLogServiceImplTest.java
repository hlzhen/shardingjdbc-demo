package org.sj.demo.service.impl;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sj.demo.entity.HlzLog;
import org.sj.demo.service.HlzLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

/**
 * TODO: Delete todo after editing description
 * created by Lz on 2023/12/2 10:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HlzLogServiceImplTest extends TestCase {


    @Autowired
    private HlzLogService logService;

    @Test
    public void testSave() {

        for (int i = 0; i < 200; i++) {
            HlzLog log = new HlzLog();
            log.setContents("测试内容" + i);
            log.setOpcode("测试操作" + i);
            log.setOpuser("测试用户" + i);
            log.setOpdt(LocalDateTime.now());
            log.setTitle("测试标题" + i);
            log.setUserid(1L);
            log.setType("测试类型" + i);
            logService.save(log);
        }
    }
}