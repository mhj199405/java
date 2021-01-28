package com.tongtech.classes;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/3 18:41
 */
public class Demo_Stduent {
    public static void main(String[] args) {
        StduentDemo demo = new StduentDemo();
        demo.gender="女";
        demo.name="张爱玲";
        demo.age=124;
        System.out.println(demo.name+demo.gender+demo.age);
        demo.study();
        demo.sleep();
    }
}
class  StduentDemo{
    String name;
    int age;
    String gender;
    public void study(){
        System.out.println("学生学习");
    }
    public  void sleep(){
        System.out.println("学生睡觉");
    }
}
