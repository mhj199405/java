package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/19 11:31
 */
public class Demo3_Extends {
    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }
}
/*
 *  A:继承的注意事项
 *  a:子类只能继承父类所有非私有的成员(成员方法和成员变量)
 *  b:子类不能继承父类的构造法发方法，但是可以通过super关键字去访问父类的构造方法
 *  c：不要为了部分功能而去继承
 */
class  Father{
    public void show(){
        System.out.println("Hello World!");
    }
}
class Son extends Father{}













