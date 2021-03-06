package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/19 11:54
 */
public class Demo5_Extends {
    public static void main(String[] args) {
        Son2 son2 = new Son2();
    }
}
/*
* A:案例演示：
*   子类中所有的构造方法默认都会访问父类中空参的构造方法
* B：为什么呢？
*   因为子类会继承父类中的数据，可能还会使用父类的数据
*   所以，子类初始化之前，一定要先完成父类数据的初始化。
*   其实：
*      每一个构造方法的第一条语句默认都是：super() Object类最顶层的父类
*/
class Father2{
   public  Father2(){
       System.out.println("Father2的构造方法");
   }
}
class Son2 extends Father2{
    public Son2(){
        super(); // 这是一条语句，如果不写，系统会默认加上；用来访问父类中的空参构造
        System.out.println("Son2的构造方法");
    }
}
