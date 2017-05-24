package com.jk.controller;

import com.jk.entity.Banner;
import com.jk.service.BannerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

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

    @RequestMapping("selectBannerMessageList")
    @ResponseBody
    public List<Banner> selectBannerMessageList(){
        List<Banner> bannerList = bannerService.selectBannerMessageList();
        return bannerList;
    }
}
