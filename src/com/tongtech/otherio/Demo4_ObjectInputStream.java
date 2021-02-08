package com.tongtech.otherio;

import com.tongtech.otherio.bean.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/8 12:56
 */
public class Demo4_ObjectInputStream {
    /*
    * ObjectInputStream
    * 对象输入流，进行反序列化
    * */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //demo1();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        ArrayList<Person> list =(ArrayList<Person>) ois.readObject();//将集合对象一次读取
        Iterator<Person> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static void demo1() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        Person p1= (Person) ois.readObject();
        Person p2= (Person) ois.readObject();
        //Person p3= (Person) ois.readObject(); //当文件读取到末尾时出现EOFException
        System.out.println(p1);
        System.out.println(p2);
        ois.close();
    }
}
