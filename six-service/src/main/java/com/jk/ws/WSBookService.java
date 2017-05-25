package com.jk.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by dell on 2017/5/25.
 */
@WebService
public interface WSBookService {

    @WebMethod(operationName = "t1")
    public void test1();

    @WebMethod(operationName = "t2")
    public int test2();

    @WebMethod(operationName = "t3")
    public void test3(String name);
}
