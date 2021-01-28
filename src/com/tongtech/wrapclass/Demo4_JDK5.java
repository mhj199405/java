package com.tongtech.wrapclass;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/13 19:40
 */
public class Demo4_JDK5 {
    public static void main(String[] args) {
        int i=90;
        Integer integer = new Integer(i); //将基本数据类型转化为包装类型，装箱

        int i1 = integer.intValue(); //将包装类型转化为基本数据类型，拆箱

        Integer ii=200; //自动装箱，将基本数据类型转化为包装类型
        int j=ii+10; //自动拆箱，将包装类型转化为基本数据类型
        System.out.println(j);
    }
}
