package com.tongtech.interfaces;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/25 19:18
 */
public class Demo3_Interface {
    public static void main(String[] args) {

    }
}
/*
* A : 类与类，类与接口，接口与接口的关系
*    a ： 类与类
*         继承关系，只能单继承，可以多层继承
*    b：类与接口
*        实现关系，可以但实现，也可以多实现
*        并且还可以在继承一个类的同时实现多个接口
*    c：接口与接口
*         继承关系，可以单继承，也可以多继承。
* */
interface InterA{
    public abstract  void printA();
}
interface InterB{
    public abstract void printB();
}
interface InterC extends InterA,InterB {
    public abstract  void printC();
}
class Demo3 implements InterA,InterB{
    @Override
    public void printA() {
        System.out.println("print   B");
    }

    @Override
    public void printB() {
        System.out.println("PintA");
    }
}


















