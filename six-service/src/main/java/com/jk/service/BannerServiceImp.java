package com.jk.service;

import com.jk.mapper.BannerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dell on 2017/5/24.
 */
@Service
public class BannerServiceImp implements BannerService {

    @Resource
    private BannerMapper bannerMapper;
}
