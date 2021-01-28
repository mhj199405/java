package com.tongtech.string.test;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/14 19:43
 */
public class Test7 {
    public static void main(String[] args) {
        String max="wojimihaijun,mihaijun,wobushimihaijun,nameqingwensheishimihaijun";
        String min="mihaijun";
        int count=0;
        int value;
        while((value=max.indexOf(min))!=-1){
            count++;
            max=max.substring(value,value+min.length());
        }
        System.out.println(count);
    }
}
