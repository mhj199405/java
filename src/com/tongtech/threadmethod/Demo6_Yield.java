package com.tongtech.threadmethod;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/29 10:18
 * Yield让出cpu礼让线程
 */
public class Demo6_Yield {
    public static void main(String[] args) {
          new MyThread().start();
          new MyThread().start();
    }
}
class MyThread extends  Thread{
    @Override
    public void run() {
        for (int i=0;i<=1000;i++){
            if(i%10==0){
                Thread.yield(); // 让出线程
            }
            System.out.println(getName()+"----"+i);
        }
    }
}