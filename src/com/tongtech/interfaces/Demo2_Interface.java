package com.tongtech.interfaces;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/25 18:52
 */
public class Demo2_Interface {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.print();
        System.out.println(Inrerface.num);
    }
}
/*
* 成员变量；只能是常量，并且是静态的并公共的
*        默认修饰符 public static final
*        建议：自己动手给出
*  构造方法： 接口没有构造方法
*  成员方法：只能是抽象方法
*        默认修饰符： public abstract
*        建议：自己手动给出
* */
interface Inrerface{
   public static final int num=10;   // 接口中定义的变量都是常量
                                     // public static final这三个关键字的位置可以互换
    // public Inrerface(){}  //接口中没有构造方法
    //public void print(){}  //接口中不能定义费抽象方法
    void print();

}
class Demo2 /*extends Object*/ implements Inrerface{  // 一个类不写继承任何类，默认继承Object
    public void print(){
        System.out.println(num);
    }
    public Demo2(){
        super();
    }
}
