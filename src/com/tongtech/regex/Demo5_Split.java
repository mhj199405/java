package com.tongtech.regex;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/14 17:49
 */
public class Demo5_Split {
    public static void main(String[] args) {
        String s="张三 李四 王五";
        String[] arr = s.split("\\s");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        String s1="张三.李四.王五";
        String[] arr1 = s1.split("\\."); //通过正则表达式切割字符串
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
