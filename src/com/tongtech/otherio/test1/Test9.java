package com.tongtech.otherio.test1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/15 20:25
 */
public class Test9 {
    public static void main(String[] args) throws IOException {
    //demo1();
        Properties properties = new Properties();
        properties.put("张三","23");
        properties.put("李四","24");
        properties.put("王五","25");
        properties.put("赵六","26");
        //System.out.println(properties);
        Enumeration<String> enumeration =(Enumeration<String>) properties.propertyNames();
        while (enumeration.hasMoreElements()){
            String key = enumeration.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key+"=="+value);
        }
    }
    public static void demo1()throws IOException{
        //使用File类来创建一个mhj.properties文件
        /*File file = new File("mhj.properties");
        file.createNewFile();*/
        Properties properties = new Properties();
        properties.load(new FileInputStream("mhj.properties"));
        properties.setProperty("username","张三");
        properties.setProperty("password","zs242628");
        properties.store(new FileOutputStream("mhj.properties"),"wellcome to you");
    }
}
