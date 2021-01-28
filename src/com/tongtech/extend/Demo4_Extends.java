package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/19 11:42
 */
public class Demo4_Extends {
    public static void main(String[] args) {
        Son1 son1 = new Son1();
        son1.print();
    }
}
/*
 * A:案例演示：
 *  a:不同名的变量
 *  b：同名的变量
 */
class Father1{
    int num1=10;
    int num2=30;
}
class Son1 extends Father1{
    int num2=20;
    public void print(){
        System.out.println(this.num1);//this可以调用本类的，也可以调用父类的(本类没有的情况下)其实是继承调用
        System.out.println(this.num2); // 就近原则，子类的有，就不用父类的了
        System.out.println(super.num2);
    }
}
