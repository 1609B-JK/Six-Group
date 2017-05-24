package com.jk.controller;

import com.jk.entity.Banner;
import com.jk.service.BannerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dell on 2017/5/24.
 */
@Controller
@RequestMapping("banner")
public class BannerController {

    @Resource
    private BannerService bannerService;

    @RequestMapping("test")
    public void test(){
        System.out.println(1);
        bannerService.test();
    }

    @RequestMapping("selectBannerMessageList")
    public ModelAndView selectBannerMessageList(){
        List<Banner> bannerList = bannerService.selectBannerMessageList();
        ModelAndView mv = new ModelAndView();
        mv.addObject("bannerList",bannerList);
        mv.setViewName("../../index");
        return mv;
    }
}
