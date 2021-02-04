package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/19 11:19
 */
public class Demo_Extends {
    public static void main(String[] args) {
        DemoC c = new DemoC();
        c.show();
    }
}
/*
 * A: Java中类的继承特点
 *  a: java只支持单继承、不支持多继承。
 *     有些语言支持多继承，格式 extends 类1,类2
 *  b:Java支持多层继承(继承体系)
 * B：案列演示
 *  Java中类的继承特点
 *    如果想用这个体系的所有功能，用最底层的类创建对象
 *    如果想看这个体系的共性功能，看最顶层的类
 */
class DemoA{
    public void show(){
        System.out.println("我是DemoA中的show方法");
    }
}
class DemoB extends DemoA{
    public void method(){
        System.out.println("我是DemoB中的method方法");
    }
}
class DemoC extends DemoB{
    public void print(){
        System.out.println("我是DemoC中print方法");
    }
}
