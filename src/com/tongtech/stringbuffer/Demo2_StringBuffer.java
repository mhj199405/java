package com.tongtech.stringbuffer;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/8 9:28
 */
public class Demo2_StringBuffer {
    /*
    * A:StringBuffer的添加功能
    * public StringBuffer append(String str);
    *    可以把任意类型数据添加到字符串缓冲区里面，并返回字符串缓冲区本身
    * public StringBuffer insert(int offset,String str)
    *    在指定的位置把任意类型的数据插入到字符串缓冲区里面，并返回字符串缓冲区本身
    * StringBuffer是字符缓冲区，当new的时候是在堆内存创建一个对象，底层是一个长度为16的字符数组
    * 当调用添加的方法时，不会再重新创建对象，在不断向原缓冲区添加字符
    * */
    public static void main(String[] args) {
       //demo1();
        StringBuffer sb = new StringBuffer("1234");
        sb.insert(3,"米海军");
        System.out.println(sb);// 在指定的位置插入元素，如果没有指定位置的索引就会报索引越界异常
    }
    public static  void demo1(){
        StringBuffer sb =new StringBuffer();
        StringBuffer s1 = sb.append(false);
        StringBuffer s2 = sb.append("heima");
        StringBuffer s3 = sb.append(100);
        System.out.println(sb.toString()); // StringBuffer重写了toString方法，显示的是对象中的属性值
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}

















