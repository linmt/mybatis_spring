package com.lmt.reflection;

import com.lmt.annotation.Demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by 热带雨林 on 2018/11/10.
 */
//执行一个类中全部以@Demo标注的方法--3
public class ExecuteDemoMethod {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class cls=Class.forName("com.lmt.reflection.TestCase");
        Object obj=cls.newInstance();
        Method[] ary=cls.getDeclaredMethods();
        for(Method method:ary){
            Object ann=method.getAnnotation(Demo.class);
            System.out.println(ann);
            if(ann!=null){
                System.out.println("执行结果："+method.invoke(obj));
            }
        }
    }
}
