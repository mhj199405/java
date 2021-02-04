package com.tongtech.threads;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/30 15:53
 */
public class Demo3_ReentrantLock {
}
class Print3{
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