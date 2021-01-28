package com.tongtech.regex;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/14 19:29
 */
public class Demo6_Regex {
    public static void main(String[] args) {
        String s="我爱2黑马";
        String regex="\\d";
        System.out.println(s.replaceAll(regex,""));
    }
}
