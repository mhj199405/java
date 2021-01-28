package com.tongtech.wrapclass;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/13 12:54
 */
public class Demo1_Integer {
    /*A、为什么会有基本类型包装类
    *  将基本数据类型包装成对象的好处在于可以在对象中定义更多的功能方法操作该数据
    * B、常用操作
    *  常用的操作之一：用于基本数据类型与字符串之间的转换
    * C:基本类型和包装类型的对应
    * byte    Byte
    * short   Short
    * int     Integer
    * long    Long
    * float   Float
    * double  Double
    * char    Character
    * boolean Boolean
    * */
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(60)); //将整数转换为二进制
        System.out.println(Integer.toOctalString(60));// 将整数转换为八进制
        System.out.println(Integer.toHexString(60));//将整数转化为十六进制
    }
}














