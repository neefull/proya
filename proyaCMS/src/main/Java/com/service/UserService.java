package com.service;

import com.common.BaseService;
import com.dao.SysLogMapper;
import com.entity.SysLog;
import com.dao.UserMapper;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by wzf on 2017/5/28.
 */
@Service
public class UserService extends BaseService<User, UserMapper> {


    @Autowired
    private SysLogMapper mapper;

    @Autowired
    private SysLogService sysLogService;

    public void aa(){
        SysLog sysLog =new SysLog();
        sysLog.setUsername("12312");
        sysLog.setCreateDate(new Date());
        sysLog.setIp("234324");
        sysLog.setMethod("23");
        sysLog.setParams("3");
        mapper.insert(sysLog);
        sysLogService.insert(sysLog);
    }


}
