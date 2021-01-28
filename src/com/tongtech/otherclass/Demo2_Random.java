package com.tongtech.otherclass;

import java.util.Random;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/15 16:57
 */
public class Demo2_Random {
    public static void main(String[] args) {
     //demo1();
        Random r = new Random();
      for (int i=0;i<10;i++){
          System.out.print(r.nextInt(10)+" ");
      }
    }
    public static void demo1(){
        Random r = new Random();
        for(int i=0;i<10;i++){
            System.out.println(r.nextInt());
        }
        System.out.println("-------------------");
        Random r2 = new Random(10000);
        System.out.println(r2.nextInt());
        System.out.println(r2.nextInt());
    }
}
