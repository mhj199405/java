package com.tongtech.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/30 13:18
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String s = scanner.nextLine();
            try {
                int i = Integer.parseInt(s);
                System.out.println(Integer.toBinaryString(i));
                break;
            } catch (Exception e) {
                try {
                    new BigInteger(s);  //存放一个过大整数
                    System.out.println("数字过大");
                } catch (Exception exception) {
                    try {
                        new BigDecimal(s);
                        System.out.println("输入的是一个小数");
                    } catch (Exception ex) {
                        System.out.println("您输入的是一个非法字符");
                    }
                }
            }

        }
    }
}
