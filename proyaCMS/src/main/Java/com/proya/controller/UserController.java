package com.proya.controller;

import com.proya.entity.sys.SysLog;
import com.proya.entity.User;
import com.proya.common.BaseController;
import com.proya.service.SysLogService;
import com.proya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by wzf on 2017/5/30.
 */

@Controller
@RequestMapping("user")
public class UserController extends BaseController {


    @Autowired
    private UserService userService;
    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world");
        return "index";
    }

    @RequestMapping("/userService")
    public String insert(User user){
//        user.setUsername("21sdf");
//        userService.insert(user);
        userService.aa();
        return "index";
    }

    @RequestMapping("/sysLogService")
    public String insert(SysLog sysLog){
        sysLog.setUsername("12312");
        sysLog.setCreateDate(new Date());
        sysLog.setIp("234324");
        sysLog.setMethod("23");
        sysLog.setParams("3");
        sysLogService.insert(sysLog);


        return "index";
    }

}
