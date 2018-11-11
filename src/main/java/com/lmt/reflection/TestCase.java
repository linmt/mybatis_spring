package com.lmt.reflection;

import com.lmt.annotation.Demo;

/**
 * Created by 热带雨林 on 2018/11/10.
 */
//执行一个类中全部以@Demo标注的方法--1
public class TestCase {
    @Demo
    public void hello(){
        System.out.println("hello");
    }
    @Demo
    public void hellokitty(){
        System.out.println("hello kitty");
    }
}
