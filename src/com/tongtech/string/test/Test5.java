package com.tongtech.string.test;

import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/4 20:34
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = scanner.nextLine();
        char[] array = s.toCharArray();
         String s1="";
         for(int i=array.length-1;i>=0;i--){
             s1=s1+array[i];
         }
        System.out.println(s1);
    }
}
