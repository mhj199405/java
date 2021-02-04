package com.tongtech.wrapclass;

import sun.rmi.server.InactiveGroupException;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/13 13:03
 */
public class Demo2_Integer {
    /*
    * A:Integer类的概述
        * 通过jdk提供的API,查看Integer
        *
        * Integer类在对象中包装了一个基本类型int的值
        * 该类提供了多个方法，能在int类型和String类型之间互相转换
        * 还提供了处理int类型时非常有用的其他一些常量和方法
    * B：构造方法
        * public Integer (int value)
        * public Integer(String s)
    * C:案例演示
        * 使用构造方法创建对象
    *
    * */
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Integer integer = new Integer(100);
        System.out.println(integer);
        Integer integer1 = new Integer("100");
        System.out.println(integer1);
        //Integer afaf = new Integer("afaf");// java.lang.NumberFormatException数字格式异常
        //System.out.println(afaf);  // 因为afaf不是数字字符串，所以转换会报错
    }
}













