package com.tongtech.conmmon;

import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/22 17:51
 */
public class Scaaner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = scanner.nextInt();
        System.out.println("请输入一个整数：");
        int j = scanner.nextInt();
        System.out.println("i+j="+i+j);
    }
}
