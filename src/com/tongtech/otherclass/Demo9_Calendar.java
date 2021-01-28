package com.tongtech.otherclass;

import java.util.Calendar;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/18 13:36
 */
public class Demo9_Calendar {
    public static void main(String[] args) {
      //demo1();
        Calendar c = Calendar.getInstance();
        //c.add(Calendar.DAY_OF_WEEK,-1); //对于指定的字段向前加或者向后加
        //c.set(Calendar.YEAR,1998);
        c.set(Calendar.DAY_OF_MONTH,7);
        System.out.println(c.get(Calendar.YEAR)+"年"+getNum(c.get(Calendar.MONDAY)+1)+"月"+getNum(c.get(Calendar.DAY_OF_MONTH))+"日"
                +getWeek(c.get(Calendar.DAY_OF_WEEK)));
    }
    public static void demo1(){
        Calendar c = Calendar.getInstance(); //父类引用指向子类对象
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR)); //通过字段获取年
        System.out.println(c.get(Calendar.MONDAY)+1);//通过字段获取月，但是是从0开始编号
        System.out.println(c.get(Calendar.DAY_OF_MONTH));//月中的第几天
        System.out.println(c.get(Calendar.DAY_OF_WEEK));//周日是第一天，周六是最后一天
        System.out.println(c.get(Calendar.YEAR)+"年"+getNum(c.get(Calendar.MONDAY)+1)+"月"+getNum(c.get(Calendar.DAY_OF_MONTH))+"日"
                +getWeek(c.get(Calendar.DAY_OF_WEEK)));
    }
    /*
    *   将星期存储表中进行查表
    *   1、返回值类型String
    *   2、参数列表int week
    *
    * */
    public static String getWeek(int week){
        String[] arr={"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return arr[week];
    }
    public static String getNum(int num){
        return num>9 ? ""+num : "0"+num;
    }
}
