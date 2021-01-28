package com.tongtech.polymorphic;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/22 19:30
 */
public class Demo1_Polymorphic {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        Animal a=new Cat();  // 父类引用指向子类对象
        a.eat();
    }
}
/*
* 多态(polymorphic)概述
*    事物存在的多种形态
* 多态前提
*    要有继承关系
*    要有方法重写
*    要有父类引用指向子类对象
*/
class Animal{
    public void eat(){
        System.out.println("动物吃饭");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
