package com.tongtech.ser;

import java.io.*;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/21 9:54
 */
public class SerializableStudent {
    public static void main(String[] args) {
        try {
            //将对象Student序列化
            ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream("G:\\obj.txt"));
            Student student = new Student("mihaijun", 26, "男");
            objOutputStream.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        * 将对象反序列化
        * */
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("G:\\obj.txt"));
            try {
                System.out.println(((Student)objectInputStream.readObject()).toString());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
