package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/19 17:06
 */
public class Test2_Extends {
    public static void main(String[] args) {
        Zi1 z = new Zi1();
    }
     /*
     * jvm调用了main方法，mian进栈
     * 遇到Zi1 z=new Zi1()；会先将Fu1.class和Zi1.class分别加载进内存，再创建对象,当Fu1.class加载内存，
     * 父类的静态代码块会随着Fu1.class一起加载，当Zi1.class加载进内存，子类的静态代码块会随着Zi1.class一起加载；
     *
     * 第一个输出 ：静态代码快Fu1,第二个输出静态代码块Zi1
     * 走Zi1类的构造法方法，因为java中是分层初始化的，先初始化父类，再初始化子类，所以先走的父类构造，但是在执行
     * 父类构造时，发现父类有构造代码块，构造代码块是优先于构造方法执行的，所以
     * 第三个输出构造代码块Fu1，第四个输出构造方法Fu1
     * 第四步 父类初始化结束，子类初始化，第五个输出的是构造代码块Zi1,构造方法Zi1
     * */
}
class Fu1{
    static {
        System.out.println("静态代码块Fu1");
    }
    {
        System.out.println("构造代码块Fu1");
    }
    public Fu1(){
        System.out.println("构造方法Fu1");
    }
}
class Zi1 extends Fu1{
    static {
        System.out.println("静态代码块Zi1");
    }
    {
        System.out.println("构造代码块Zi1");
    }
    public Zi1(){
        System.out.println("构造方法zi1");
    }
}