package com.tongtech.threadmethod;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/29 9:46
 * join()，当前线程暂停，等待指定的线程执行结束后，当前线程在继续;
 * 也就是下面程序，t2执行中 aaaaa出现2次之后，t1执行完之后，t2再执行其他的;
 * join(200)
 */
public class Demo4_Join {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println(getName()+"-"+i+"..aaaaa");
                }
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    if(i==2){
                        try {
                            t1.join(1); //插队指定的时间，过了指定时间后，两条线程交替执行
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(getName()+"-"+i+"..bbbbb");
                }
            }
        };
        t1.start();
        t2.start();
    }
}
