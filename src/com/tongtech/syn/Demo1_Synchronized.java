package com.tongtech.syn;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/29 10:47
 */
public class Demo1_Synchronized {
    public static void main(String[] args) {
       final Printer p=new Printer();
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
class Printer{
    Demo d=new Demo();
    public void print1(){             //同步代码块，锁机制，锁对象可以是任意的
        synchronized (d) {
            while (true){
                System.out.print("微");
                System.out.print("智");
                System.out.print("信");
                System.out.print("业");
                System.out.print("\r\n");
            }
        }
    }
    public void print2(){
        //synchronized (new Demo()) {        //锁对象不能使用匿名对象，因为匿名对象不是同一个对象
        synchronized (d) {
            while (true){
                System.out.print("微");
                System.out.print("智");
                System.out.print("程");
                System.out.print("序");
                System.out.print("员");
                System.out.print("\r\n");
            }
        }
    }

}
class Demo{}

