package com.lmt.reflection;

import org.apache.commons.collections.map.HashedMap;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 热带雨林 on 2018/11/11.
 */
//spring原型案例--1
public class ApplicationContext {
    private Map<String,Object> beans=new HashMap<String,Object>();
    public ApplicationContext(String xml) throws DocumentException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        //从Resource（classpath）中读取流
        InputStream in=getClass().getClassLoader().getResourceAsStream(xml);
        //读取xml文件
        SAXReader reader=new SAXReader();
        Document doc=reader.read(in);
        in.close();
        //解析xml文件，得到bean的类名和ID
        Element root=doc.getRootElement();
        List<Element> list=root.elements();
        for(Element e:list){
            String id=e.attributeValue("id");
            String className=e.attributeValue("class");
            //根据类名动态加载类并且创建对象
            Class cls=Class.forName(className);
            Object bean=cls.newInstance();
            //将对象和对应的ID添加到map中
            beans.put(id,bean);
        }
    }
    public Object getBean(String id){
        //根据ID在map中查找对象并返回
        return beans.get(id);
    }
    public <T>T getBean(String id,Class<T> cls){
        return (T)beans.get(id);
    }
}
