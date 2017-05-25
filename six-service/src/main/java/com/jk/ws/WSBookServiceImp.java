package com.jk.ws;

import javax.jws.WebService;

/**
 * Created by dell on 2017/5/25.
 */
@WebService
public class WSBookServiceImp implements WSBookService {


    @Override
    public void test1() {
        System.out.println("你好。");
    }

    @Override
    public int test2() {
        System.out.println("返回数字");
        return 0;
    }

    @Override
    public void test3(String name) {
        System.out.println("你好，"+name);
    }
}
