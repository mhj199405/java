package com.tongtech.interfaces;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/26 10:57
 */
public class Test1_Animal {
    public static void main(String[] args) {
        Cat cat = new Cat("汤姆",1);
        cat.eat();
        cat.sleep();
        System.out.println("---------------------------------");
        JumpCat jumpCat = new JumpCat("杰瑞", 2);
        jumpCat.eat();
        jumpCat.sleep();
        jumpCat.jump();
        System.out.println("---------------------------------");
        Dog dog = new Dog("缓缓", 2);
        dog.eat();
        dog.sleep();
        System.out.println("---------------------------------");
        JumpDog jumpDog=new JumpDog("大大",2);
        jumpDog.eat();
        jumpDog.sleep();
        jumpDog.jump();
    }
}
abstract class Animal{
    private String name;
    private int age;
    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void eat();
    public abstract void sleep();
}
class Cat extends Animal{
    public Cat(){}
    public Cat(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void sleep(){
        System.out.println("窝着睡");
    }
}
interface Jumping{
    public abstract void jump();
}
class JumpCat extends Cat implements Jumping{
    public JumpCat(){}
    public JumpCat(String name,int age){
        super(name,age);
    }
   public void jump(){
       System.out.println("猫跳高");
   }
}
class Dog extends Animal{
    public Dog(){}
    public Dog(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("狗吃肉");
    }
    public void sleep(){
        System.out.println("躺着睡");
    }
}
class JumpDog extends Dog implements Jumping{
    public JumpDog(){}
    public JumpDog(String name,int age){
        super(name,age);
    }
    public void jump(){
        System.out.println("跳高狗");
    }
}
