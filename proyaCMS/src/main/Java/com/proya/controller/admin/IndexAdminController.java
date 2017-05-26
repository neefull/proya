package com.proya.controller.admin;

import com.proya.common.BaseController;
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
}
