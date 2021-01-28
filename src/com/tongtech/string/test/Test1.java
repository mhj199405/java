package com.tongtech.string.test;

import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/4 11:49
 */
public class Test1 {
    /*
    * A：案例演示
    *  需求：模拟登陆，给三次机会，并且提示还有几次机会
    *  用户名和密码都是admin
    *  分析:
    *  1.模拟登陆，需要键盘输入,Scanner
    *  2.给三次机会，需要循环，for
    *  并且提示有几次，需要判断，if
    *
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<3;i++) {
            System.out.println("请输入用户名：");
            String username = scanner.nextLine();
            System.out.println("请输入用户密码:");
            String password = scanner.nextLine();
            //如果是字符串常量和字符串变量作比较，通常都是字符串常量调用方法，字符串作为参数传递，防止空指针异常
            if ("admin".equals(username) && "admin".equals(password)) {
                System.out.println("欢迎" + username + "登陆");
                break;
            } else {
                int n=2-i;
                if(n==0){
                    System.out.println("您的错误此时已到，请明天来吧");
                }else {
                    System.out.println("用户名或密码错误" + "您还有" + n + "次机会");
                }
            }
        }
    }
}
