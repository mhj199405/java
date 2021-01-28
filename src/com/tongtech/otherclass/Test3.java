package com.tongtech.otherclass;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/18 19:28
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份，判断该年是闰年还是平年");
        String s = sc.nextLine();
        int i = Integer.parseInt(s);
        boolean b=getYear(i);
        System.out.println(b);
    }
    public static  boolean getYear(int j){
        Calendar c = Calendar.getInstance();
        c.set(j,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        return c.get(Calendar.DAY_OF_MONTH)==29;
    }
}
