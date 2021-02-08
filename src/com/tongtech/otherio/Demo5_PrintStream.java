package com.tongtech.otherio;

import com.tongtech.ser.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/8 15:44
 */
public class Demo5_PrintStream {
    /*
    * PrintStream和PrintWriter分别是打印的字节流和字符流
    * 只操作数据目的的
    * */
    public static void main(String[] args) throws FileNotFoundException {
        //demo1();
        PrintWriter pw =new PrintWriter(new FileOutputStream("f.txt"),true);
        pw.println(97);          //自动刷出功能只针对的是println()方法
        pw.write(97);
       /* pw.close();*/
    }
    public static void demo1(){
        System.out.println("aaa");
        PrintStream ps = System.out; //获取标注输出流
        ps.println(97);  //底层通过Integer.toString()将97转换成字符串并打印
        ps.write(97); //查找码表，找到对应的a并打印
        System.out.println();
        Person p1 = new Person("张三", 23);
        ps.println(p1); //默认调用p1的toString方法
        System.out.println();
        Person p2=null;//打印引用数据类型，如果是null，就打印null,如果不是null就打印对象的toString方法
        ps.println(p2);
        ps.close();
    }
}
