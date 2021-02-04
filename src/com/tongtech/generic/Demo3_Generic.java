package com.tongtech.generic;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/20 20:13
 */
public class Demo3_Generic {
    /*
    * A:案例演示
    *  泛型的由来：通过Object转型问题引入
    *  早期的Object类型可以接收任意的对象类型，但是在实际的使用中，会有类型转换的问题。也就存在着隐患，所以java提供了泛型来解决
    * */
    public static void main(String[] args) {
        //demo1();
        Tool<String> t = new Tool<>();
        t.show("abcd");
        t.play("nba");
        t.play(24343424);
    }
    public static void demo1(){
        Tool<Student> tool = new Tool<>();    //创建工具类对象
        tool.setObj(new Student("张三",24));
        Worker worker =(Worker) tool.getObj(); //向下转型
        System.out.println(worker);
    }
}














