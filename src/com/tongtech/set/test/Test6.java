package com.tongtech.set.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/23 12:43
 */
public class Test6 {
    /*
    * 输入一个数字字符串，知道输入quit的时候退出
    *
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> ts = new TreeSet<>( new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int num=o1-o2;
                return num == 0 ? 1 : num;
            }
        });
        while (true){
            String str = scanner.nextLine();
            if("quit".equals(str)){
                break;
            }
            //将输入的字符串转换为整数
            int i = Integer.parseInt(str);
            //将整数添加到集合
            ts.add(i);

            for(Integer integer:ts){
                System.out.println(integer);
            }
        }
    }
}
