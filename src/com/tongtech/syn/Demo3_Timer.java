package com.tongtech.syn;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/29 17:27
 */
public class Demo3_Timer {
    public static void main(String[] args) throws InterruptedException{
        Timer t=new Timer();
        //在指定的时间安排指定的任务
        //第一个参数 是安排的任务；第二个参数是执行的时间，第三个参数是果多长时间重复执行
        t.schedule(new MyTimeTask(),new Date(120,9,29,17,41,0),6000);
        while (true){
            Thread.sleep(1000);
            System.out.println(new Date());
        }
    }
}
class MyTimeTask extends TimerTask{
    @Override
    public void run() {
        System.out.println("起床去上班");
    }
}