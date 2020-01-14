package com.xin.boot.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuartzTestServiceTest {

    @Autowired
    private QuartzTestService quartzTestService;

    @Test
    public void buildJobInstance() throws SchedulerException {
        quartzTestService.buildJobInstance();
    }
}
