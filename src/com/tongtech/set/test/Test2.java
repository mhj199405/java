package com.tongtech.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/22 14:44
 */
public class Test2 {
    /*
    * 控制台上输入一个字符串，将重复的字符去掉
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a character string:");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        for(char c:chars){
            hs.add(c);
        }
        Iterator<Character> it = hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
    }
}
