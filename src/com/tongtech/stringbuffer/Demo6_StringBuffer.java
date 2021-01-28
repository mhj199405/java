package com.tongtech.stringbuffer;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/8 10:42
 */
public class Demo6_StringBuffer {
    /*
    * String-----StringBuffer
    *   a: 通过构造方法
    *   b：通过append方法
    * StringBuffer----String
    *   a: 通过构造方法
    *   b：通过toString方法
    *   c：通过substring(0,length())方法
    * */
    public static void main(String[] args) {
       //dem1();
        StringBuffer sb = new StringBuffer("mihiajun");
        String s1 = new String(sb); // 通过String的构造方法，将StringBuffer对象转化为String字符串
        System.out.println(s1);

        String s2 = sb.toString(); //通过toString方法将StringBuffer对象转化为String字符串
        System.out.println(s2);

        String s3 = sb.substring(0, sb.length()); //通过substring方法将StringBuffer对象转化为String字符串
        System.out.println(s3);

    }
    public static  void dem1(){
        StringBuffer sb = new StringBuffer("我是米海军"); //通过构造方法将String字符串转化为StringBuffer对象
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = sb1.append("woshheimabushibaima"); //通过append方法将String字符串转化为StringBuffer对象
        System.out.println(sb2);
    }
}
