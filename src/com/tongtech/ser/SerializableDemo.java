package com.tongtech.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
/**
 * java实现对象的序列化
 * 
 * @author YaoQi
 * @date 2017年6月24日
 */
public class SerializableDemo {
    public static void main(String[] args) throws Exception {
        
        //序列化一个对象
        ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\obj.txt"));
        Person person = new Person();
        person.setName("Tom");
        person.setAge(24);

        //写入字面值常量
        objOutputStream.writeObject("将对象序列化");
        //写入匿名对象
        objOutputStream.writeObject(new Date());
        //写入对象
        objOutputStream.writeObject(person);
        
        //反序列化一个对象
        ObjectInputStream objInputStream = new ObjectInputStream(new FileInputStream("D:\\obj.txt"));
        System.out.println("读取的字面值常量："+(String)objInputStream.readObject());
        System.out.println("读取的匿名对象"+(Date)objInputStream.readObject());
        System.out.println("读取person对象"+((Person)objInputStream.readObject()).toString());
    }
}