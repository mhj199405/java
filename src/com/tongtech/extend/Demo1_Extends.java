package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/19 10:58
 */
/* 继承的好处：
 * 提高代码的复用性
 * 提高代码的维护性
 * 让类与类之间产生了关系，是多态的前提
 * 继承的弊端：
 * 类的耦合性增强了
 *
 * 开发原则：
 *  高内聚、低耦合
 *  耦合 ：类与类的关系
 *  内聚：就是自己完成某件事情的能力
 */
public class Demo1_Extends {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.color="黑色";
        cat.leg=4;
        cat.eat();
        cat.sleep();
        System.out.println(cat.color+"-------"+cat.leg);
        Dog dog = new Dog();
        dog.color="黄色";
        dog.leg=4;
        dog.eat();
        dog.sleep();
        System.out.println(dog.color+"-------"+dog.leg);
    }
}
class Animal{
    String color;
    int leg;
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
/*
* extends是继承的意思
* Animal是父类
* Cat和 Dog都是子类
* */
class Dog extends Animal{}
class Cat extends Animal{}
