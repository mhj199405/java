package com.tongtech.thread;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/28 10:46
 */
public class Demo3_Thread {
    public static void main(String[] args) {
       MyRunnable mr=new MyRunnable(); // 4、创建Runnable的子类对象
       Thread t=new Thread(mr);        // 5、将其当做参数传递给Thread的构造函数
       t.start();                      // 6、开启线程
        for(int i=0;i<100000;i++){
            System.out.println("bb");
        }
    }
}
class MyRunnable implements Runnable{ //1、定义一个类实现Runnable接口
    @Override
    public void run() {               //2、重写run方法
        for (int i=0;i<100000;i++){   //3、将要执行的代码写在run方法中
            System.out.println("aa");
        }
    }
}