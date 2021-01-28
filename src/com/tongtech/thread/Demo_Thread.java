package com.tongtech.thread;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/28 9:51
 * 证明jvm是多线程的
 *
 */
public class Demo_Thread {
    public static void main(String[] args) {
       for(int i=0;i<1000000;i++){
         new Demo();
       }
       for (int i=0;i<1000000;i++){
           System.out.println("我是主线程的执行代码");
       }
    }
}
class Demo{
    @Override
    public void finalize(){
        System.out.println("垃圾被清扫");
    }
}

