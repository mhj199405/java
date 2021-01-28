package com.tongtech.conmmon;

import java.util.Arrays;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/20 10:28
 */
public class Shuzu {
    public static void main(String[] args) {
        int[] a=new int[3];
        a[0]=2;
        a[1]=3;
        a[2]=12;
        int[] b=new int[]{1,2,4};
        int[] c={1,23,5};
//        System.out.println(a[2]+"-----"+a.length);
//        System.out.println(b[2]+"-----"+b.length);
//        System.out.println(c[2]+"-----"+c.length);
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        reversArr(arr);
    }
    public static void reversArr(int a[]){
       for(int i=0;i<a.length/2;i++){
           int temp=0;
           temp=a[i];
           a[i]=a[a.length-1-i];
           a[a.length-1-i]=temp;
       }
    }
}
