package com.tongtech.classes;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/7 19:54
 *  A: 构造方法概述和作用
 *    给对象的数据(属性）进行初始化
 *  B：构造方法格式特点
 *    方法名和类名相同(大小也要和类名一致)
 *    没有返回值类型，连void都没有
 *    没有具体的返回return
 *
 *
 */
public class Demo_Constructor {
    public static void main(String[] args) {
        Person person = new Person();
//        person.Person();  // 构造方法不能适用对象调用
        person.show();
    }
}
class Person{
    private String name;
    private int age;
    public Person(){
         //System.out.println("dfasf ");
        //return; // 构造方法是有return语句的，格式是return
        name="张三";
        age=26;
    }
    public void show(){
        System.out.println(name+"----"+age);
    }
}
