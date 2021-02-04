package com.tongtech.threadmethod;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/28 14:14
 */
public class Demo2_CurrentThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                System.out.println(getName()+"...aaaaaaaa");
            }
        }.start();

       new Thread( new Runnable(){
           @Override
           public void run() {
               // Thread.CurrentThread()获取当前正在执行的现线程
               System.out.println(Thread.currentThread().getName()+"...bbbbb");
           }
       }).start();
        Thread.currentThread().setName("我是主线程");
        System.out.println(Thread.currentThread().getName());
    }
}
