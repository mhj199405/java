package com.tongtech.exception;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/28 17:23
 */
public class Demo5_Throwable {
    /*
    * A:Throwable的几个常见方法
    *    a:getMessage()
    * 　　　　　获取异常信息，返回字符串
    *    b:toString()
    *          获取异常类名和异常信息，返回字符串
    *    c:printStackTrace()
    *          获取异常类名和异常信息，以及异常出现在程序中的位置。返回void。
    * B：案例演示
    *    Throwable的几个常见方法的基本使用
    *
    * */
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (Exception e) {
//            System.out.println(e.getMessage()); //获取异常的信息
//              System.out.println(e.toString());//获取异常的类名和异常的信息
            e.printStackTrace(); //获取异常的类名和异常的信息以及异常出现在程序中的位置<jvm默认使用这种方式处理异常>
        }
    }
}
