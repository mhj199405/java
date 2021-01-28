package com.tongtech.threads;
/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/29 17:48
 * 等待唤醒机制
 */
public class Demo1_Notify {
    public static void main(String[] args) {
       final Printer p=new Printer();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        p.print1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
               while (true){
                   try {
                       p.print2();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
            }
        }.start();
    }
}
class Printer{
    private int flag=1;
    public void print1() throws InterruptedException{ //同步方法只需要在方法上加关键字synchronized即可
        synchronized (this) {
            if(flag!=1){
                this.wait();
            }
            System.out.print("微");
            System.out.print("智");
            System.out.print("信");
            System.out.print("业");
            System.out.print("\r\n");
            flag=2;
            this.notify(); //随机唤醒耽搁线程
        }
    }
    public void print2() throws InterruptedException{
        synchronized (this) {
            if(flag!=2){
              this.wait();  // 当前线程等待
            }
            System.out.print("微");
            System.out.print("智");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.print("\r\n");
            flag=1;
            this.notify();
        }
    }
}
