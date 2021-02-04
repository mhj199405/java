package com.tongtech.classes;

import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/18 20:34
 */
public class Test_GuessNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个整数:");
        int i = (int) (Math.random() * 100 + 1);
        if(true){
            int nextInt = scanner.nextInt();
            if(i>nextInt){
                System.out.println("大了");
            }else if(i<nextInt){
                System.out.println("小了");
            }else {
                System.out.println("对了");
            }
        }
    }
}
