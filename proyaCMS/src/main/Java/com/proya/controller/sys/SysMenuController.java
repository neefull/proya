package com.proya.controller.sys;

import com.proya.common.BaseController;
import com.proya.service.sys.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wzf on 2017/6/11.
 */

@RestController
@RequestMapping("sysMenu")
public class SysMenuController extends BaseController {


    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("list")
    public  String list(){

        return null;
    }

}
