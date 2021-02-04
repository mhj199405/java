package com.tongtech.thread;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/28 10:09
 */
public class Demo2_Thread {
    public static void main(String[] args) {
       MyThread m=new MyThread();  //4、创建Thread类的子类对象
       m.start();                  //5、开启线程
       for(int i=0;i<100000;i++){
           System.out.println("bb");
       }
    }
}
class MyThread extends Thread{     //1、继承Thread
    @Override
    public void run() {            //2、重写run方法
         for (int i=0;i<100000;i++){ //3、将要执行的代写在run方法中
             System.out.println("aa");
         }
    }
}
