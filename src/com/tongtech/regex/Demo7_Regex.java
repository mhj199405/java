package com.tongtech.regex;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/14 19:54
 */
public class Demo7_Regex {
    public static void main(String[] args) {
     //demo1();
     //demo2();
        String s="我我....我...我..要....要要...要学....学学..学.编..编编..编.程.程.程.程..程";
        String s1 = s.replaceAll("(\\.)+", "");
        String s2 = s1.replaceAll("(.)\\1+", "$1"); // $1代表第一组的内容
        System.out.println(s2);
    }
    public static void demo2(){
        String s="asdvvrtkkkwmmm";
        String regex="(.)\\1+";
        String[] str = s.split(regex);
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+"  ");
        }
    }
    public static void demo1(){
        String regex="(.)\\1(.)\\2";
        System.out.println("高高兴兴".matches(regex));
        System.out.println("快快乐乐".matches(regex));
        System.out.println("死啦死啦".matches(regex));
        System.out.println("---------------");
        String regex1="(..)\\1";
        System.out.println("死啦死啦".matches(regex1));
        System.out.println("快快乐乐".matches(regex1));
    }
}

















