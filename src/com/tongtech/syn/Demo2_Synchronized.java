package com.tongtech.syn;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/29 10:47
 */
public class Demo2_Synchronized {
    public static void main(String[] args) {
       final Printer2 p=new Printer2();
         new Thread(){
             @Override
             public void run() {
                p.print1();
             }
         }.start();
         new Thread(){
             @Override
             public void run() {
                p.print2();
             }
         }.start();
    }

}

class Printer2{
    Demo d=new Demo();
    //非静态的同步方法的锁对象是什么
    //答：非静态的同步方法的锁对象是this
    //静态的同步方法的锁对象是什么
    //答：静态的同步方法的锁对象是该类的字节码
    public static synchronized void print1(){ //同步方法只需要在方法上加关键字synchronized即可
            System.out.print("微");
            System.out.print("智");
            System.out.print("信");
            System.out.print("业");
            System.out.print("\r\n");

    }
    public static void print2(){

            synchronized (Printer2.class) {
                System.out.print("微");
                System.out.print("智");
                System.out.print("程");
                System.out.print("序");
                System.out.print("员");
                System.out.print("\r\n");
        }
    }
}

