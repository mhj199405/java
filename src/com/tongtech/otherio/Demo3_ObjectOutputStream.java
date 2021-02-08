package com.tongtech.otherio;

import com.tongtech.otherio.bean.Person;

import java.io.*;
import java.util.ArrayList;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/8 11:37
 */
public class Demo3_ObjectOutputStream {
    /*
    * 什么是序列流：
    *   序列流可以把多个字节输入流整合成一个，从序列流中读取数据时，将从被整合的第一个流开始读，读完一个之后继续读第二个
    *
    * */
    public static void main(String[] args)throws IOException {
      //demo1();
        Person p1 = new Person("张三", 23);
        Person p2= new Person("李四",24);
        Person p3= new Person("王五",25);
        Person p4= new Person("赵六",26);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(list);
        oos.close();
    }
    public static void demo1() throws IOException{
        Person p1 = new Person("张三", 26);
        Person p2= new Person("李四",27);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.close();
    }
}
