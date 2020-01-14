package com.xin.boot.service;

import com.xin.boot.job.JobInstanceTest;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * quartz测试类
 */
@Service
public class QuartzTestService {
    @Autowired
    private Scheduler scheduler;

    public void buildJobInstance() throws SchedulerException {
        //设置任务开始时间(并不是cron触发器类型)
        long startTime = System.currentTimeMillis() + 1000 * 1;
        //设置分组
        String groupName = JobInstanceTest.class.getName();
        //设置任务名称
        String detailName = UUID.randomUUID().toString();
        //cron调度器
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/30 * * * * ?");
        //创建任务
        JobDetail jobDetail = JobBuilder.newJob(JobInstanceTest.class).withIdentity(detailName, groupName).build();
        //创建任务触发器
        //Trigger trigger = TriggerBuilder.newTrigger().withIdentity(detailName, groupName).startAt(new Date(startTime)).build();
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity(detailName, groupName).withSchedule(cronScheduleBuilder).build();
        //将触发器与任务绑定到调度器中
        scheduler.scheduleJob(jobDetail, trigger);
    }
}
