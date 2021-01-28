package com.tongtech.regex;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/14 15:49
 */
public class Demo2_Regex {
    /*
    *[abc] a b 或c(简单类)
    *[^abc] 任何字符，除了a b c(否定)
    *[a-zA-Z]a到z或A到Z,两头的字母包括在内(范围)
    *[a-d[m-p]]a到d或m到p：[a-dm-p](并集)
    *[a-z&&[def]]d e 或f(交集)
    *[a-z&&[^bc]]a到z，除了b和c：[ad-z](减去)
    *[a-z&&[^m-p]]a到z，而非m到p：[a-lq-z](减去)
    * */
    public static void main(String[] args) {
     //demo1();
     //demo2();
     //demo3();
     //demo4();
     //demo5();
        String regex="[a-z&&[^m-p]]";
        System.out.println("a".matches(regex));
        System.out.println("m".matches(regex));
        System.out.println("q".matches(regex));
    }
    public static void demo5(){
        String regex="[a-z&&[^bc]]";
        System.out.println("a".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("c".matches(regex));
        System.out.println("d".matches(regex));
    }
    public static void demo4(){
        String regex="[a-d[m-p]]";
        System.out.println("a".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("c".matches(regex));
        System.out.println("d".matches(regex));
        System.out.println("m".matches(regex));
        System.out.println("n".matches(regex));
        System.out.println("p".matches(regex));
        System.out.println("l".matches(regex));
        System.out.println("f".matches(regex));
    }
    public static void demo3(){
        String regex="[a-zA-Z]";
        System.out.println("a".matches(regex));
        System.out.println("A".matches(regex));
        System.out.println("z".matches(regex));
        System.out.println("Z".matches(regex));
        System.out.println("1".matches(regex));
        System.out.println("%".matches(regex));
    }
    public static void demo2(){
        String regex="[^abc]";
        System.out.println("d".matches(regex));
        System.out.println("e".matches(regex));
        System.out.println("g".matches(regex));
        System.out.println("h".matches(regex));
        System.out.println("a".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("c".matches(regex));
        System.out.println("10".matches(regex)); //10代表的是 1和0连个字符，不是单个字符
    }
    public static  void demo1(){
        String regex = "[abc]";
        System.out.println("a".matches(regex)); //结果:true
        System.out.println("b".matches(regex)); //结果:true
        System.out.println("c".matches(regex)); //结果:true
        System.out.println("d".matches(regex)); //结果:false
        System.out.println("1".matches(regex)); //结果:false
    }
}















