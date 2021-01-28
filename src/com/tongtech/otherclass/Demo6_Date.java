package com.tongtech.otherclass;
import java.util.Date;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/15 19:18
 */
public class Demo6_Date {
    /*
    * A:Date类的概述
    *    类Date表示特定的瞬间，精确到毫秒。
    * B:构造方法
    *    public Date()
    *    public Date(long datea)
    * C:成员方法
    *    public long getTime()
    *    public void setTime()
    * */
    public static void main(String[] args) {
       //demo1();
        Date date = new Date();
        date.setTime(1000);//设置毫秒值，改变时间对象
        System.out.println(date);
    }
    public static void demo1(){
        Date date = new Date();     //如果没有传参数代表的是当前时间
        System.out.println(date);
        Date date1 = new Date(0);  // 如果构造方法中参数传入的是0代表的是1970，通过毫秒值获取对象时间
        System.out.println(date1);
        //  获取当前时间的毫秒值
        Date date2 = new Date();
        System.out.println(date2.getTime());  //通过时间对象获取毫秒值
        System.out.println(System.currentTimeMillis()); //通过系统类的方法获取毫秒值
    }
}

















