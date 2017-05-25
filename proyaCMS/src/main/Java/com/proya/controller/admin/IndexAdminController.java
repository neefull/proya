package com.proya.controller.admin;

import com.proya.common.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wzf on 2017/5/23.
 */
@Controller
@RequestMapping("indexAdmin")
public class IndexAdminController extends BaseController{

    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world");
        return "index";
    }

}
