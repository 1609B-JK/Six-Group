package com.jk.controller;

import com.jk.service.BannerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by dell on 2017/5/24.
 */
@Controller
public class BannerController {

    @Resource
    private BannerService bannerService;

    @RequestMapping("test")
    public void test(){
        System.out.println(1);
        bannerService.test();
    }
}
