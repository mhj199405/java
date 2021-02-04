package com.tongtech.string.test;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/4 19:29
 */
public class Test3 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        String s="["; //定义一个字符串用来与数组中的元素拼接
        for(int i=0;i<a.length;i++){
            if(i==a.length-1){
               s=s+a[i]+"]";
            }else{
                s=s+a[i]+",";
            }
        }
        System.out.println(s);
    }
}
