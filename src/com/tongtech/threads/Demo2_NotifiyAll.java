package com.tongtech.threads;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/30 14:56
 */
public class Demo2_NotifiyAll {
    public static void main(String[] args) {
       Print2 pt=new Print2();
       new Thread(){
               @Override
               public void run() {
                while (true){
                    try {
                        pt.print1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
               }
       }.start();
       new Thread(){
           @Override
           public void run() {
              while(true){
                  try {
                      pt.print2();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
           }
       }.start();
       new Thread(){
           @Override
           public void run() {
              while(true){
                  try {
                      pt.print3();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
           }
       }.start();
    }
}
/* 1、在同步代码块中，用那个对象锁，就用那个对象调用wait方法
 * 2、为什么wait方法和notify方法定义在Object这类中？
 *  因为锁对象可以是任意类，Object是所有的类的基类，所以wait方法和notify方法定义在Object
 * 3、sleep和wati方法的区别？
 *  a,sleep方法必须传入参数，参数就是时间，时间到了自动醒来
 *    wait方法可以传入参数也可以不传入参数，传入参数就是在参数的时间结束后等待，
 *  不传入参数就是直接等待
 *  b,sleep方法在同步函数或同步代码块中，不释放锁，睡着了也抱着锁睡
 *    wait方法在同步函数或同步代码块中，释放锁
 */
class Print2{
    private int flag=1;
    public void print1() throws InterruptedException{
        synchronized (this) {
            while(flag!=1){
                this.wait();//线程1等待
            }
            System.out.print("我");
            System.out.print("是");
            System.out.print("米");
            System.out.print("海");
            System.out.print("军");
            System.out.print("\r\n");
            flag=2;
            //this.notify();
            this.notifyAll();
        }
    }
    public void print2() throws InterruptedException{
        synchronized (this) {
            while(flag!=2){
                this.wait();//线程2等待
            }
            System.out.print("我");
            System.out.print("是");
            System.out.print("米");
            System.out.print("海");
            System.out.print("斌");
            System.out.print("\r\n");
            flag=3;
            //this.notify();
            this.notifyAll();
        }
    }
    public void print3() throws InterruptedException{
        synchronized (this) {
            while(flag!=3){
                this.wait();//线程3等待。if语句在那里等待，就在那里起来
            }               //while循环是循环判断，每次都会判断标记
            System.out.print("我");
            System.out.print("是");
            System.out.print("米");
            System.out.print("海");
            System.out.print("龙");
            System.out.print("\r\n");
            flag=1;
            //this.notify();
            this.notifyAll();
        }
    }
}
