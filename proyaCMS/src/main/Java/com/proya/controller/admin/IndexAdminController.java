package com.proya.controller.admin;

import com.proya.common.BaseController;
import com.proya.entity.IndexAdmin;
import com.proya.entity.User;
import com.proya.service.IndexAdminService;
import com.proya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by wzf on 2017/5/23.
 */
@Controller
@RequestMapping("indexAdmin")
public class IndexAdminController extends BaseController{

    @Autowired
    private IndexAdminService indexAdminService;
    @Autowired
    private UserService userService;


    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world");
        return "index";
    }

    @RequestMapping("/insert")
    public String insert(IndexAdmin indexAdmin){
        indexAdmin.setCreateTime(new Date());
        indexAdmin.setPassword("111");
        indexAdmin.setUsername("ewrew");
        indexAdminService.insert(indexAdmin);
        return "index";
    }
    @RequestMapping("/userService")
    public String insert(User user){
        user.setUsername("21sdf");
        userService.insert(user);
        return "index";
    }
}
