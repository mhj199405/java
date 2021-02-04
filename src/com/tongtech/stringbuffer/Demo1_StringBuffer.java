package com.tongtech.stringbuffer;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/5 19:22
 */
public class Demo1_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.length());// 容器中的字符个数，实际值
        System.out.println(sb.capacity());// 容器的初始容量， 理论值
        System.out.println("------------------");
        StringBuffer sb1= new StringBuffer(10);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        System.out.println("-------------------");
        StringBuffer sb2= new StringBuffer("zhansanlisi");
        System.out.println(sb2.length());//实际字符的个数
        System.out.println(sb2.capacity());// 字符串的length+初始容量
    }
}
