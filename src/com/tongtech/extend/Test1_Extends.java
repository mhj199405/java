package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/19 16:58
 */
class Fu{
    public int num=10;
    public Fu(){
        System.out.println("Fu");
    }
}
class Zi extends Fu{
    public int  num=20;
    public Zi(){
        System.out.println("zi");
    }
    public void show(){
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
public class Test1_Extends {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}
