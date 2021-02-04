package com.tongtech.threadmethod;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/28 14:33
 */
public class Demo3_Sleep {
    public static void main(String[] args) throws InterruptedException {
       //demo1();
        new Thread(){
            @Override
            public void run() {
               for(int i=0;i<10;i++){
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(getName()+"...aaaa");
               }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
               for(int i=0;i<10;i++){
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(getName()+"...bbbb");
               }
            }
        }.start();
    }
    public static void demo1() throws InterruptedException{
        for(int i=20;i>=0;i--){
//            Thread.sleep(1000);
            System.out.println("倒计时"+i+"秒");
        }
    }
}
