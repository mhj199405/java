package com.tongtech.file;

import java.io.File;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/1 11:12
 */
public class Demo1_File {
    /*
           File(String pathname):通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
           File(String parent, String child):从父路径名字符串和子路径名字符串创建新的 File实例。
      *    File(File parent, String child):从父抽象路径名和子路径名字符串创建新的 File实例。
    * */
    public static void main(String[] args) {
        //demo1();
        //demo2();
        File parent = new File("F:\\C++");
        String child="11.c";
        File file = new File(parent, child);
        System.out.println(file.exists());
    }
    public static void demo2(){
        String parent="F:\\C++";
        String child="11.c";
        File file = new File(parent, child);
        System.out.println(file.exists());
    }
    public static void demo1(){
        File file = new File("F:\\C++\\11.c");
        System.out.println(file.exists());
        String s1="a.txt";
        File file1 = new File(s1);
        System.out.println(file1.exists());
        String s2="b.txt";
        File file2 = new File(s2);
        System.out.println(file2.exists());
    }
}
