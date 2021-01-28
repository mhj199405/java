package com.tongtech.abstracts;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/25 16:44
 */
public class Demo4_Abstract {
    public static void main(String[] args) {
    }
}
/*
*  A：面试题1
*      一个抽象类如果没有抽象方法，可不可以定义为抽象类？如果可以，有什么意义？
*      可以
*      这么做的目的只有一个，就是不让其他类创建本类对象，交给之类完成
*  B：面试题2
*      abstract不能和那些关键字共存
*      abstract和static
*        被abstract修饰的方法没有方法体
*        被static修饰的可以用类名.调用，但是类名.调用抽象方法是没有意义的
*      abstract和final
*        被abstract修饰的方法强制子类重写
*        被final修饰的方法不让子类重写，所以他两是矛盾的
*      abstract和private
*         被abstract修饰的是为了让子类看到并强制重写
*         被private修饰不让子类访问，所以所以他两矛盾
*
* */
abstract class Demo1{
    //public static abstract void print(); //错误：非法的修饰符组合: abstract和static
    //public final abstract void print();  //错误: 非法的修饰符组合: abstract和final
    //private final abstract void print(); //错误: 非法的修饰符组合: abstract和private
}
