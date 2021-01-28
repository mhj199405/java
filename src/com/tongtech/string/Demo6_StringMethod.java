package com.tongtech.string;

import com.tongtech.bean.Person;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/4 18:13
 */
public class Demo6_StringMethod {
    public static void main(String[] args) {
        //demo1();
       // demo2();
        //demo3();
        demo4();
    }
    public static void demo1(){
        String s1="abc";
        // 将字符串转换为字节数组
        byte[] bytes = s1.getBytes();
        for(int i=0;i<bytes.length;i++){
            //System.out.print(bytes[i]+" ");
        }
        String s2="你好你好";
        //通过utf-8码表将字符串转化为字节数组
        byte[] bytes1 = s2.getBytes();
        for(int i=0;i<bytes1.length;i++){
            /**
             * 编码：把我们看的懂得，转换为计算机看的懂的；
             * gbk码表一个中文代表两个字节
             * gbk码表的特点：中文的第一个字节肯定是负数
             * utf-8码表一个中文代表三个字节
             */
            //System.out.print(bytes1[i]+" ");
        }
        String s3="琲";
        byte[] bytes2 = s3.getBytes();
        for(int i=0;i<bytes2.length;i++){
            System.out.print(bytes2[i]+" ");
        }
    }
    public static void demo2(){
       String s="heima";
        char[] arr = s.toCharArray(); //将字符串转化为字符数组
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //先获取字符串的索引，根据索引获取字符串
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
    }
    public static void demo3(){
        char[] arr={'a','b','c','d'};
        String s = String.valueOf(arr); // 底层是String类的构造方法完成的
        System.out.println(s);
        String s2=String.valueOf(100); // 将100转化为字符串
        System.out.println(s2+100);
        Person person = new Person("张三", 26);
        String s3=String.valueOf(person); //调用的是toString方法
        System.out.println(s3);
    }
    public static void demo4(){
        String s="ABCCBsss";
        String s2="safdfsafsdfafsfdss";
       String s1= s.toLowerCase(); // 把字符串转化为小写
        System.out.println(s1);
        String s3=s2.toUpperCase();
        System.out.println(s3);
        System.out.println(s1+s3);// 用+拼接更强大，可以用字符串与任意类型相加
        System.out.println(s1.concat(s3));//concat方法调用的和传入的都必须是字符串
    }
}
