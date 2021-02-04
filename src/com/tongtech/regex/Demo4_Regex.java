package com.tongtech.regex;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/14 17:27
 */
public class Demo4_Regex {
    /*
    * Greedy数量词
    *  X? X,一次或一次也没有
    *  X* X,零次或多次
    *  X+ X,一次多次
    *  X{n} X,恰好n次
    *  X{n,}X,至少n次
    *  X{n,m}X,至少n此，但是不超过m次
    * */
    public static void main(String[] args) {
        //demo1();
        //demo2();
        //demo3();
        //demo4();
        //demo5();
        String regex="[abc]{2,4}";
        System.out.println("ac".matches(regex));
        System.out.println("abc".matches(regex));
        System.out.println("abca".matches(regex));
        System.out.println("a".matches(regex));
        System.out.println("".matches(regex));
    }
    public static void demo5(){
        String regex="[abc]{5,}";
        System.out.println("abcac".matches(regex));
        System.out.println("adcacad".matches(regex));
        System.out.println("adcacf".matches(regex));
    }
    public static void demo4(){
        String regex="[abc]{5}";
        System.out.println("abcac".matches(regex));
        System.out.println("abcaca".matches(regex));
    }
    public static void demo3(){
        String regex="[abc]+";
        System.out.println("a".matches(regex));
        System.out.println("abc".matches(regex));
        System.out.println("aaaaaaaabbbccc".matches(regex));
    }
    public static void demo2(){
        String regex="[abc]*";
        System.out.println("".matches(regex));
        System.out.println("a".matches(regex));
        System.out.println("ab".matches(regex));
        System.out.println("abc".matches(regex));
    }
    public static  void demo1(){
        String regex="[abc]?";
        System.out.println("a".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("c".matches(regex));
        System.out.println("d".matches(regex));
        System.out.println("".matches(regex));
    }
}















