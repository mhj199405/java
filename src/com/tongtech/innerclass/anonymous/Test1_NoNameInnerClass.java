package com.tongtech.innerclass.anonymous;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/29 16:28
 */
public class Test1_NoNameInnerClass {
    public static void main(String[] args) {
        PersonDemo personDemo = new PersonDemo();
        personDemo.method(new Person() { //　匿名内部类当做参数传递(本质把匿名内部类看做一个对象)
            @Override
            public void show() {
                System.out.println("show");
            }
        });
    }
}
// 这里写抽象类，接口都行
abstract  class Person{
    public abstract void show();
}
class PersonDemo{
    //public void method(Person p){    // Person p=new Student()
    /*
    *  Person p=new Person(){    // 父类引用指向子类对象
    *    public void show(){
    *    System.out.println("show")
    *    }
    *  };
    *
    * */
        public void method(Person p){
        p.show();
    }
}
//class Student extends Person{
//    public void show(){
//        System.out.println("show");
//    }
//}
