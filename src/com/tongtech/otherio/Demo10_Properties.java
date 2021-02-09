package com.tongtech.otherio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/9 11:16
 */
public class Demo10_Properties {
    /*
    * Properties是HashTable的子类
    * */
    public static void main(String[] args) throws IOException {
       //demo1();
       //demo2();
       /* File file = new File("config.properties");
        file.createNewFile();*/
        Properties properties = new Properties();
        properties.load(new FileInputStream("config.properties"));//将文件上的键值对读到集合中
        properties.setProperty("username","admin");
        properties.store(
    new FileOutputStream("config.properties"),null);//第二个参数是对列表参数的描述，可以值，也可以给null
        System.out.println(properties);
    }
    public static void demo1(){
        Properties pro = new Properties();
        pro.put("张三","18893706258");
        pro.put("李四","13995008574");
        Enumeration<String> enumeration = (Enumeration<String>) pro.propertyNames();
        while (enumeration.hasMoreElements()){
            String key = enumeration.nextElement();
            //String value =(String) pro.get(key);
            final String value = pro.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
    public static void demo2(){
        Properties properties = new Properties();
        properties.setProperty("中国","北京");
        properties.setProperty("日本","东京");
        System.out.println(properties);
    }
}
