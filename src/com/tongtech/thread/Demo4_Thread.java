package com.tongtech.thread;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/28 11:30
 */
public class Demo4_Thread {
    public static void main(String[] args) {
       new Thread(){                      // 1、继承Thread类
           @Override
           public void run() {            // 2、重写run方法
               for (int i=0;i<100000;i++){  // 3、将要执行的代码写在run方法中
                   System.out.println("aa");
               }
           }
       }.start();                          // 4、开启线程

      new Thread( new Runnable(){           // 1、将Runnable的子类对象传递给Thread的构造方法
          @Override
          public void run() {               // 2、重写run方法
              for (int i=0;i<100000;i++){    // 3、将要执行的代码写在run方法中
                  System.out.println("bb");
              }
          }
      }).start();                          // 4、开启线程
    }
}
