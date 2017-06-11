package com.proya.service;

import com.proya.entity.sys.SysLog;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by wzf on 2017/5/29.
 */
public class SysLogServiceTest {

    @Autowired
    private static  SysLogService sysLogService;
    @BeforeClass
    public static void init() {//junit之前init spring
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:test/test.xml");//这里路径之前没有配对于是一直出错

        sysLogService = (SysLogService)context.getBean("SysLogService");
    }


    @Test
    public void insert() throws Exception {
        SysLog sysLog =new SysLog();
        sysLog.setUsername("12312");
        sysLog.setCreateDate(new Date());
        sysLog.setIp("234324");
        sysLog.setMethod("23");
        sysLog.setParams("3");
        sysLogService.insert(sysLog);
    }

    @Test
    public void selectByPrimaryKey() throws Exception {

    }

}