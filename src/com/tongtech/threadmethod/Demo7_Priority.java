package com.tongtech.threadmethod;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/29 10:31
 */
public class Demo7_Priority {
    public static void main(String[] args) {
      Thread t1=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    System.out.println(getName()+"--"+i+"......aaaa");
                }
            }
        };
      Thread t2=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    System.out.println(getName()+"--"+i+"......bbbb");
                }
            }
        };
//      t1.setPriority(10);
//      t2.setPriority(1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
      t1.start();
      t2.start();
    }
}
