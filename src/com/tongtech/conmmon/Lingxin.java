package com.tongtech.conmmon;

import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/11/23 10:14
 */
public class Lingxin {
    public static void main(String[] args) {
        System.out.println("input size:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if(size<=0 || size%2==0){
            System.out.println("the size is error!\n");
            System.exit(-1);
        }
        for(int i=1;i<=size;i++){
            int n=(i<=(size+1)/2)?i:size-i+1;
            int m=(size-n)/2;
            for(int k=1;k<=m;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
