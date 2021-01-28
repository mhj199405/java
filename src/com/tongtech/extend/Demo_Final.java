package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/22 19:05
 */
public class Demo_Final {
    public static void main(String[] args) {
        final int num=10;
        //num=20;
        System.out.println(num);
      final   Persons persons = new Persons("李四", 26);
//      persons=new Persons("书范德萨看",26);
        persons.setName("掌上");
        persons.setAge(27);
        System.out.println(persons.getName()+"----"+persons.getAge());
        method(10);
        method(20);
    }
    public static  void method(final  int x){
        System.out.println(x);
    }
}
/*
*   final修饰基本数据类型，表示值是不能被改变的
*   final修饰引用类型，表示地址不能被改变，对象中的属性可以改变
* */

class Persons{
    private String name;
    private int age;
    public Persons(){}

    public Persons(String name, int age) {
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
}
