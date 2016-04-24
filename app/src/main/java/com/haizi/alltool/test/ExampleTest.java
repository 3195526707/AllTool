package com.haizi.alltool.test;

import android.test.InstrumentationTestCase;

import com.haizi.alltool.entity.UserInfo;

/**
 * Created by Administrator on 2016/4/24.
 */
public class ExampleTest extends InstrumentationTestCase {

    public void test() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("aaaa");
        System.out.println(userInfo.getName().toString());
    }

    public void test2() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("aaaaaa");
        System.out.println(userInfo.getName().toString());
    }

}
