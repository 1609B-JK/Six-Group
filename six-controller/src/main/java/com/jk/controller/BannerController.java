package com.jk.controller;

import com.jk.service.BannerService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by dell on 2017/5/24.
 */
@Controller
public class BannerController {

    @Resource
    private BannerService bannerService;
}
