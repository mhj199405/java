package com.tongtech.polymorphic;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/22 19:36
 */
public class Demo2_Polymorphic {
    public static void main(String[] args) {
       Father a=new Son();
        System.out.println(a.num);

        Son s=new Son();
        System.out.println(s.num);
        Father f = new Son();
        f.print();
        f.method();   // 相当于Father.method()调用
    }
}
/*成员变量
*   编译看左边(父类)，运行看左边(父类)
* 成员方法：
*   编译看左边(父类)，运行看右边(子类);动态绑定；编译的时候看父类中有没有print方法，调用的是子类中的print方法
*  静态方法
*    编译看左边(父类)，运行看左边(父类)
*    (静态和类相关，算不上重写，所以访问还是看左边)
*    只有非静态方法的成员方法，编译看左边，运行看右边
* */
class Father{
    int num=10;
    public void print(){
        System.out.println("Father");
    }
    public static void method(){
        System.out.println("Father static method");
    }
}
class Son extends Father{
    int num=20;
    public void print(){
        System.out.println("Son");
    }
    public static void method(){
        System.out.println("Son static method");
    }
}
