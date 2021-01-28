package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/22 19:16
 */
public class Demo3_Final {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.print();
    }
}
/*
*   final修饰变量的初始化时机
*     显示初始化
*     在对象构造完成前即可
*
* */

class Demo{
    final int num;        // final修饰的成员变量的默认初始化是无效的
    public Demo(){
        num=90;
    }
    public void print(){
        System.out.println(num);
    }

}
