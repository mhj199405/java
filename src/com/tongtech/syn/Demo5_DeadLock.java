package com.tongtech.syn;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/29 15:56
 */
public class Demo5_DeadLock{
    private static String s1="左筷子";
    private static String s2="右筷子";
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
               while(true){
                   synchronized (s1) {
                       System.out.println(getName()+"....获取"+s1+"等待"+s2);
                   }
                   synchronized (s2) {
                       System.out.println(getName()+"....拿到筷子"+s2+"开吃");
                   }
               }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
               while(true){
                   synchronized (s2) {
                       System.out.println(getName()+"....获取"+s2+"等待"+s1);
                   }
                   synchronized (s1) {
                       System.out.println(getName()+"....拿到筷子"+s1+"开吃");
                   }
               }
            }
        }.start();
    }
}
