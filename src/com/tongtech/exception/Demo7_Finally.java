package com.tongtech.exception;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/29 18:15
 */
public class Demo7_Finally {
    /*
    * A:finally的特点
    *     被finally的语句体一定会执行
    *     特殊情况，在执行finally之前jvm退出了(比如System.exit(0))
    * B:finally的作用
    *     用于释放资源，在IO流操作和数据库操作中会见到
    * C:案例演示
    *     finally关键字的特点及作用
    *
    * */
    public static void main(String[] args) {
       try {
           System.out.println(10/0);
       }catch (Exception e){
           System.out.println("除数为零了");
           System.exit(0); //退出jvm虚拟机
           return;
       }finally {
           System.out.println("234来看定时反馈");
       }
    }
}
