package com.haizi.alltool.test;

import android.test.InstrumentationTestCase;

import com.haizi.alltool.entity.User;

/**
 * Created by Administrator on 2016/4/24.
 */
public class ExampleTest extends InstrumentationTestCase {

    public void test() {
        User user = new User();
        user.setName("aaaa");
        System.out.println(user.getName().toString());
    }

    public void test2() {
        User user = new User();
        user.setName("aaaaaa");
        System.out.println(user.getName().toString());
    }

}
