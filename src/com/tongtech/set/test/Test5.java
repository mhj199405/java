package com.tongtech.set.test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/23 12:35
 */
public class Test5 {
    /*
    * 输入一个字符串，不去除重复的字符，并且排序
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] chars=string.toCharArray();
        TreeSet<Character> ts = new TreeSet<>( new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                int num=o1-o2;
                return num == 0 ? 1 : num;
            }
        });
        for (char c : chars){
            ts.add(c);
        }
        Iterator<Character> it = ts.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
    }
}
