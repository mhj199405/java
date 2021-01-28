package com.tongtech.otherclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/15 19:59
 */
public class Demo7_SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        //demo1();
        //demo2();
       //demo3();
        String str="1994年05月08日08:08:08";
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date parse = sdf.parse(str);    //将时间字符串转化为日期对象
        System.out.println(parse);
    }
    public static  void demo3(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss"); //创建日期格式化类对象
        String format = sdf.format(date);//将日期转化为想要显示的字符串格式
        System.out.println(format);
    }
    public static void demo2(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(d)); // 21-1-15 下午8:14
    }
    public static void demo1(){
        //DateFormat sft=new DateFormat();//DateFormat是一个 抽象类，不允许被实例化
        // DateFormat dateInstance=new SimpleDateFormat()
        DateFormat dateInstance = DateFormat.getDateInstance();  //相当于父类指向子类对象，右边的方法返回一个子类对象
        System.out.println(dateInstance);
    }
}
