package com.tongtech.regex;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/14 16:50
 */
public class Demo3_Regex {
    /*
    * . 任何字符
    * \d 数字：[0-9]
    * \D非数字:[^0-9]
    * \s 空白字符[\t\n\x0B\f\r]
    * \S 非空白字符:[^\s]
    * \w 单词字符:[a-zA-Z_0-9]
    * \W 非单词字符：[^\w]
    * */
    public static void main(String[] args) {
        //demo1();
        //demo2();
        //demo3();
        //demo4();
       String regex="\\W";
        System.out.println("1".matches(regex));
        System.out.println("a".matches(regex));
        System.out.println("_".matches(regex));
        System.out.println("&".matches(regex));
        System.out.println("*".matches(regex));
        System.out.println("^".matches(regex));
        System.out.println("#".matches(regex));
        System.out.println("@".matches(regex));
        System.out.println("!".matches(regex));
    }
    public static void demo5(){
        String regex="\\w";
        System.out.println("a".matches(regex));
        System.out.println("0".matches(regex));
        System.out.println("1".matches(regex));
        System.out.println("z".matches(regex));
        System.out.println("_".matches(regex));
        System.out.println("%".matches(regex));
        System.out.println("^".matches(regex));
        System.out.println("^&".matches(regex));
    }
    public static  void demo4(){
        String regex="\\S";
        System.out.println(" ".matches(regex));
        System.out.println("a".matches(regex));
        System.out.println("aa".matches(regex));
    }
    public static  void demo3(){
        String regex="\\s";
        System.out.println(" ".matches(regex));
        System.out.println("    ".matches(regex));
        System.out.println("    ".matches(regex));
    }
    public static void demo2(){
        String regex="\\d"; //  \是转义字符，如果想要表示\d，需要\\d
        System.out.println("0".matches(regex));
        System.out.println("a".matches(regex));
        System.out.println("9".matches(regex));
    }
    public static void demo1(){
        String regex="..";
        System.out.println("a".matches(regex));
        System.out.println("ab".matches(regex));
    }
}
















