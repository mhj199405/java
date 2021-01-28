package com.tongtech.scanner;

import java.util.Scanner;

public class Demo1_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc= new Scanner(System.in);  //键盘录入
          if(sc.hasNextInt()){
        	  int  i= sc.nextInt();//键盘录入整数存储在 i
              System.out.println(i);
          }else{
        	  System.out.println("输入的类型不正确");
          }
	}
}
