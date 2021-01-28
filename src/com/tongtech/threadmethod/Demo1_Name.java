package com.tongtech.threadmethod;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/28 11:46
 */
public class Demo1_Name {
    public static void main(String[] args) {
//          demo1();
         Thread t1= new Thread(){
              @Override
              public void run() {
                  //this.setName("张三");
                  System.out.println(this.getName()+"..........aaaaaaaaaaaa");
              }
          };
        Thread t2=new Thread(){
            @Override
            public void run() {
                //this.setName("李四");
                  System.out.println(this.getName()+"..........bbbbbbbbbbbb");
            }
        };
        t1.setName("李四");
        t2.setName("张三");
        t1.start();
        t2.start();
    }

    public static void demo1() {
        new Thread("芙蓉姐姐") {  // 通过构造方法给name赋值
            @Override
            public void run() {
                System.out.println(this.getName() + "......aa");
            }
        }.start();

        new Thread("凤姐") {
            @Override
            public void run() {
                System.out.println(this.getName() + "......bb");
            }
        }.start();
    }
}
