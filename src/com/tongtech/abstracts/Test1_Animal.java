package com.tongtech.abstracts;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/23 18:40
 */
public class Test1_Animal {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1("小",12);
        System.out.println(cat1.getName()+"----"+cat1.getAge());
        cat1.eat();
        cat1.catchMouse();
        System.out.println("---------------------");
        Dog1 dog1 = new Dog1("小",12);
        System.out.println(dog1.getName()+"----"+dog1.getAge());
        dog1.eat();
        dog1.lookHome();
    }
}
abstract class Animals{
  private String  name;
  private int age;
    public Animals() {
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
}
class Cat1 extends Animals{
    public Cat1(){}
    public Cat1(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println();
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
class Dog1 extends Animals{
    public Dog1(){}
    public Dog1(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("狗吃屎");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
