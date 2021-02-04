package com.tongtech.syn;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/29 16:28
 * 单例设计模式：保证类在内存中只有一个对象
 */
public class Demo1_Singleton {
    public static void main(String[] args) {
          Singleton s1=Singleton.s; //成员变量被私有，不能通过类名.调用
         // Singleton.s=null;
          Singleton s2=Singleton.s;
        System.out.println(s1==s2);
//        Singleton s1=Singleton.getSingleton();
//        Singleton s2=Singleton.getSingleton();
//        System.out.println(s1==s2);
    }
}
/*
 * 饿汉式
 */
/*class Singleton{
    //1、私有构造方法，其他类不能访问该构造方法
    private Singleton(){}
    //2、创建本类对象
    public static Singleton s=new Singleton();
    //3、对外提供公共的访问方法
    public static Singleton getSingleton(){  // 获取实例
        return s;
    }*/

/**
 *懒汉式：单列的延迟和加载
 */
/*class Singleton{
    //1、私有构造方法，其他类不能访问该构造方法
    private Singleton(){}
    //2、申明一个引用
    public static Singleton s;
    //3、对外提供公共的访问方法
    public static Singleton getSingleton(){  // 获取实例
        if(s==null){
            // 线程1等待，线程2等待
            s=new Singleton();
        }
        return s;
    }
}*/
/**
 * 饿汉式和懒汉式的区别
 * 1、饿汉式是空间换时间，懒汉式是时间换空间
 * 2、在多线程访问时，饿汉式不会创建多个对象；懒汉式有可能会创建多个对象
 */
class Singleton{
    //1、私有构造方法，其他类不能访问该构造方法
    private Singleton(){}
    //2、申明一个引用
    public static final Singleton s=new Singleton();
}