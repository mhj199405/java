package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/21 15:59
 */
public class Demo7_Extends {
    public static void main(String[] args) {
        Son7 son7 = new Son7();
        son7.print();
        son7.method();
    }
}
/*
*  不同名的方法
*   同名的方法
* */
class Father7{
    public void print(){
        System.out.println("Father7 print");
    }
}
class Son7 extends  Father7{
    public void method(){
        System.out.println("Son7 method");
    }
    public void print(){
        super.print();    // super可以调用父类的成员方法
        System.out.println("Son7 print");
    }
}
