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
        Scanner in=new Scanner(System.in);
        System.out.println("输入类名");
        String className=in.nextLine();
        Class cls=Class.forName(className);
        System.out.println(cls);
        Object obj=cls.newInstance();
        System.out.println(obj);
        Method[] ary=cls.getDeclaredMethods();
        for(Method method:ary){
            System.out.println(method);
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            //System.out.println(method.invoke(obj));
            System.out.println("------------------");
        }

        String name="hello4";
        Class[] types={String.class,int.class};
        Method method=cls.getDeclaredMethod(name,types);
        System.out.println(method);

        /**
         class com.lmt.reflection.Foo
         com.lmt.reflection.Foo@68ffefc9
         public void com.lmt.reflection.Foo.hello2()
         public void com.lmt.reflection.Foo.hello1()
         public void com.lmt.reflection.Foo.hello3()
         */
    }
}
