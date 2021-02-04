package com.tongtech.innerclass.member;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/28 10:21
 */
public class Demo2_InnerClass {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.print();
    }
}
class Outer1{
    private int num=10;
    private class Inner1{
        public void method(){
            final  int a=90;
            System.out.println("Hello World!"+num);
        }
    }
    public void print(){
        Inner1 inner1 = new Inner1();
        inner1.method();
    }
}
