package com.tongtech.stringbuffer;
import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/8 11:17
 */
public class Demo7_StringBuffer {
    /*
    *  A:形式参数问题
    *    String作为参数传递
    *    StringBuffer作为参数传递
    *  B:案例演示
    *    String和StringBuffer作为参数传递
    *  基本数据类型的值传递，不会改变其值
    *  引用数据类型的值传递，会改变其值
    *  String类虽然是引用数据类型，但是作为参数传递的时候和基本数据类型一样的
    * */
    public static void main(String[] args) {
//        String s="woshi";
//        System.out.println(s);
//        demo(s);
//        System.out.println(s);
        StringBuffer sb = new StringBuffer();
        sb.append("woshimihaijun");
        System.out.println(sb);
        demo1(sb);
        System.out.println(sb);
    }

    public static void demo1(StringBuffer s) {
        s.append("yebushimihaijun");
    }
}
