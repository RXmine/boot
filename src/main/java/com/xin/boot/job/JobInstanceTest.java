package com.xin.boot.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * quartz job实例测试类
 */
public class JobInstanceTest extends QuartzJobBean {

    private static Logger logger = LoggerFactory.getLogger(JobInstanceTest.class);

    /**
     * 定时任务逻辑实现方法
     * 每当触发器触发时会执行该方法逻辑
     *
     * @param jobExecutionContext 任务执行上下文
     * @throws JobExecutionException
     */
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("执行定时任务逻辑");
        System.out.println("正在执行quartz job实例业务");
    }
}
