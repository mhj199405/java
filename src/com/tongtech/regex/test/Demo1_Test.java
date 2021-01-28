package com.tongtech.regex.test;

import java.util.Arrays;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/14 18:14
 */
public class Demo1_Test {
    public static void main(String[] args) {
        String s="12 8 3 2";
        String[] split = s.split(" ");
        int [] arr=new int[split.length];
        for(int i=0;i< arr.length;i++){
            arr[i]=Integer.parseInt(split[i]); //将字符串转化为数字
        }
        Arrays.sort(arr);
      /*  String ss=" ";*/
        /* 这种写法产生的垃圾很多
        for(int i=0;i<arr.length;i++){
             if(i==arr.length-1){
                  ss=ss+arr[i];
             }else{
                  ss=ss+arr[i]+" ";
             }
        }
        System.out.println(ss);*/
        StringBuffer sb = new StringBuffer();
        for(int i=0;i< arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+" ");
            }
        }
        System.out.println(sb.toString());
    }
}
