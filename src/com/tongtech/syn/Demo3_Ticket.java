package com.tongtech.syn;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/29 11:32
 *
 *  需求：铁路售票，一共100张，通过四个窗口卖完(使用继承Thread)
 *
 */
public class Demo3_Ticket {
    public static void main(String[] args) {
          new Ticket().start();
          new Ticket().start();
          new Ticket().start();
          new Ticket().start();
    }
}
class Ticket extends Thread{
    private static int ticket=100;
    private static Object obj=new Object(); //如果用引用数据类型成员变量当做锁对象，必须是静态的,并且锁对象是唯一的一个
    @Override
    public void run() {
      while(true){
          synchronized (obj) {
              if(ticket<=0){
                break;
              }
              try {
                  Thread.sleep(10);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              System.out.println(getName()+"....这是第"+ticket--+"号票");
          }
      }
    }
}