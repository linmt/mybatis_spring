package com.lmt.reflection;

import org.dom4j.DocumentException;

import java.io.IOException;

/**
 * Created by 热带雨林 on 2018/11/11.
 */
//spring原型案例--3
public class ReadBeans {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, DocumentException, IOException {
        ApplicationContext ac=new ApplicationContext("beans.xml");
        Foo f=(Foo)ac.getBean("foo");
        Foo f2=(Foo)ac.getBean("foo");
        System.out.println(f+"  "+f2);//同一个对象
    }
}
