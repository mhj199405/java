package com.tongtech.abstracts;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/23 16:24
 */
public class Demo1_Abstract {
    public static void main(String[] args) {
       // Animal a=new Animal() ; // 错误：Animal是抽象的；无法实例化
        System.out.println("Hello World");
        Animal a = new Cat();   // 父类引用指向子类对象
        a.eat();
    }
}
/*
* 抽象类特点
*   a :抽象类和抽象方法必须用abstract关键字修饰
*      abstract class 类名{}
*      public abstract void 方法名();
*   b ：抽象类不一定有抽象方法，有抽象方法的类一定是抽象类或者是接口
*   c ：抽象类不能实例化，那么，抽象类如何实例化？
*      按照多态的方式，由具体的子类实例化。其实这也是多态的一种，抽象类多态
*   d :抽象类的子类
*      要么抽象类
*      要么重写抽象类中的所有抽象方法
* */
abstract class Animal{    // 抽象类
    public abstract void eat(); // 抽象方法
    public Animal(){
        System.out.println("父类Animal");
    }
}
class Cat extends Animal{
    public Cat(){
        super();
        System.out.println("子类cat");
    }
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
abstract class Dog extends Animal{}