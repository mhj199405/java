package com.tongtech.stringbuffer.test;

import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/8 11:11
 */
public class Test2_StringBuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = scanner.nextLine();
        StringBuffer sb = new StringBuffer(s);
        String s1 = sb.reverse().toString();
        System.out.println(s1);
    }
}
