package com.tongtech.otherclass;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/15 15:39
 */
public class Demo1_Math {
    public static void main(String[] args) {
        System.out.println(Math.PI);
         //获取绝对值
        System.out.println(Math.abs(-32));
        //向上取整，结果是一个double
        System.out.println(Math.ceil(12.32));
        System.out.println(Math.ceil(12.99));
        System.out.println("---------------");
        //向下取整，结果是一个double
        System.out.println(Math.floor(12.99));
        System.out.println(Math.floor(12.99));
        //获取两个值中的最大值
        System.out.println(Math.max(10,20));
        //请某个double类型的数字,第一个是底数，第二个是指数
        System.out.println(Math.pow(2,4));
        System.out.println((int)(Math.random()*101));

        System.out.println(Math.round(12.4));
        System.out.println(Math.round(12.5));
        System.out.println(Math.sqrt(9));
    }
}
