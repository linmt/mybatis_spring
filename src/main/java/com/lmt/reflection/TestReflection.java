package com.lmt.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by 张洲徽 on 2018/11/8.
 */
public class TestReflection {
    public static void main(String[] args)
            throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, InvocationTargetException, NoSuchMethodException {
//        Scanner in=new Scanner(System.in);
//        System.out.println("输入类名");
//        String className=in.nextLine();
//        Class cls=Class.forName(className);
//        System.out.println(cls);
        Class cls=Class.forName("com.lmt.reflection.Foo");
        Object obj=cls.newInstance();
        //System.out.println(obj);
        Method[] ary=cls.getDeclaredMethods();
        for(Method method:ary){
            System.out.println("方法："+method);
            System.out.println("方法名："+method.getName());
            System.out.println("返回值类型："+method.getReturnType());
            if(method.getName()!="hello4"){
                System.out.println("执行结果："+method.invoke(obj));
            }
            System.out.println("------------------");
        }

        Class[] types={String.class,int.class};
        Method method=cls.getDeclaredMethod("hello4",types);
        method.setAccessible(true);
        System.out.println(method.invoke(obj,"Tom",12));
        /**
         class com.lmt.reflection.Foo
         com.lmt.reflection.Foo@68ffefc9
         public void com.lmt.reflection.Foo.hello2()
         public void com.lmt.reflection.Foo.hello1()
         public void com.lmt.reflection.Foo.hello3()
         */
    }
}
