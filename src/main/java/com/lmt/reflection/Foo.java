package com.lmt.reflection;

/**
 * Created by 张洲徽 on 2018/11/8.
 */
public class Foo {
    public void hello1(){
        System.out.println("hello1");
    }
    public int hello2(){
        System.out.println("hello2");
        return 1;
    }
    public void hello3(){
        System.out.println("hello3");
    }

    private String hello4(String name,int age){
        return name+age;
    }
}
