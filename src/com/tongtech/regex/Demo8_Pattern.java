package com.tongtech.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/15 9:57
 */
public class Demo8_Pattern {
    public static void main(String[] args) {
      //demo1();
      String s="我的电话号码18893706286,我的第二个电话号码15120586741,我的成年之前的手机号码13993845324";
        Pattern pattern = Pattern.compile("1[357689]\\d{9}");
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
            System.out.print(matcher.group()+"  ");
        }

    }
    public static void demo1(){
        Pattern pattern = Pattern.compile("a*b");    // 获取到正则表达式
        Matcher matcher = pattern.matcher("aaaaaaaab"); //获取匹配器
        boolean b = matcher.matches();//看是否能匹配，能匹配上就返回true
        System.out.println(b);
        System.out.println("aaaab".matches("a*b")); //与上面的结果一致
    }
}
