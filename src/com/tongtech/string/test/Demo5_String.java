package com.tongtech.string.test;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/4 19:33
 */
public class Demo5_String {
    public static void main(String[] args) {
        String s="heima";
        String s1="   abcdc  ";
        String replace = s.replace('a', 'i'); // 用i 替换 a
        System.out.println(replace);
        System.out.println(s.replace('o','a')); //o不存在，保留原字符串
        System.out.println(s.replace("ei","ao"));
        System.out.println(s1.trim());
        String s2="a";
        String s3="aaaa";
        System.out.println(s3.compareTo(s2)); // 按照码表值比较
        String s4="黑";
        String s5="马";
        System.out.println('黑'+0); //查找的是Unicode码表值
        System.out.println('马'+0);
        System.out.println(s4.compareTo(s5));
        String s6="heima";
        String s7="HEIMA";
        System.out.println(s6.compareTo(s7));
        System.out.println(s6.compareToIgnoreCase(s7));
    }
}
