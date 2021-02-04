package com.tongtech.string;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/4 9:44
 */
public class Demo3_String {
    public static void main(String[] args) {
        String s1="ab";
        String s2="abc";
        String s3=s1+"c";
        System.out.println(s2==s3);
        System.out.println(s3.equals(s2));
    }
}
