package com.tongtech.threadmethod;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/28 15:00
 * 守护线程：当一个线程结束时，另一个线程也跟着结束(守护线程)
 */
public class Demo4_Daemon {
    public static void main(String[] args) {
        //匿名线程
        Thread t1=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<2;i++){
                    System.out.println(getName()+"AAAAAAAAAAAAAAAAA");
                }
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<50;i++){
                    System.out.println(getName()+"BBBB");
                }
            }
        };
        t2.setDaemon(true); // 当传入true就是意味着设置为守护线程
        t1.start();
        t2.start();
    }
}
