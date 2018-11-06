package com.lmt.ioc;

/**
 * Created by 张洲徽 on 2018/11/6.
 */
public class A {
    private D b;
    public void setB(D b){
        System.out.println("给B对象赋值");
        this.b=b;
    }
    public A(){
        System.out.println("A对象");
    }
    public void execute(){
        System.out.println("执行");
        b.f1();
    }
}
