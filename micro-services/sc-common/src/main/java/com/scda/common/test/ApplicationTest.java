package com.scda.common.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: liuqi
 * @Date: 2019/1/16 11:04
 * @Description: 测试通用父类-没有会话信息
 */
@RunWith(SpringRunner.class)
@Slf4j
public class ApplicationTest {

    @Before
    public void init() {
        log.info("开始测试-----------------\r\n");
    }

    @After
    public void after() {
        log.info("测试结束-----------------\r\n");

    }
}