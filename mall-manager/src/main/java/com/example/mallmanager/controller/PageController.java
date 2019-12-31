package com.example.mallmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zhengXiangBo
 * @Date: 2019/12/28
 * @Description: 页面管理控制器
 */
@Controller
public class PageController {



    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping("/{page}")
    public String requestPage(@PathVariable String  page){

        return page;
    }

}
