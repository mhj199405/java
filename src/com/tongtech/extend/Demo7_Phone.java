package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/21 17:41
 */
public class Demo7_Phone {
    public static void main(String[] args) {
        ios8 ios8 = new ios8();
        ios8.call();
        ios8.siri();
    }
}
/*
* 方法重写的应用：
*  当子类需要父类的功能，而功能主体子类有自己特有的内容，可以重写父类中的方法；这样；即沿袭了父类的功能，又定义了子类特有的功能
* */
class ios7{
    public void  call(){
        System.out.println("打电话");
    }
    public void siri(){
        System.out.println("Speak English");
    }
}
class ios8 extends ios7{
    public void siri(){
        System.out.println("说中文");
        super.siri();
    }
}