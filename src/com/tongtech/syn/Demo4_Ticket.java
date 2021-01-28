package com.tongtech.syn;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/29 14:31
 * 需求：铁路售票，一共100张，通过四个窗口卖完(实现Runnable接口实现)
 */
public class Demo4_Ticket {
    public static void main(String[] args) {
       Tickets ts=new Tickets();
       new Thread(ts).start();
       new Thread(ts).start();
       new Thread(ts).start();
       new Thread(ts).start();
       /*Thread t=new Thread(ts);  //多次启动一个线程是非法的
       t.start();
       t.start();
       t.start();
       t.start();*/
    }
}
class Tickets implements Runnable{
    private int tickets=100;
    @Override
    public void run() {
        while(true){
            synchronized (Tickets.class) {
                if(tickets<=0){
                    break;
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"---"+"这是第"+tickets--+"火车票");
            }
        }
    }
}
