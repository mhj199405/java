package com.tongtech.otherio.test1;


import java.math.BigInteger;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/12 8:46
 */
public class Test6 {
    public static void main(String[] args) {
        //System.out.println(demo1());
        System.out.println(demo2());
    }
    //统计总共有多少个0
    public static int demo1(){
        BigInteger big1 = new BigInteger("1");
        for (int i=1;i<=1000;i++){
            BigInteger big2 = new BigInteger(i + "");
            big1=big1.multiply(big2);
        }
       String s = big1.toString();
        int count=0;
       for(int i=0;i<s.length();i++){
           //根据索引值获取当前字符
           if('0' == s.charAt(i)){
               count++;
           }
       }
         return count;
    }
    // 统计尾部总共有多少个0
    public static int demo2(){
        BigInteger big1 = new BigInteger("1");
        for (int i=1;i<=1000;i++){
            BigInteger big2 = new BigInteger(i + "");
            big1=big1.multiply(big2);
        }
        String s = big1.toString();
        int count=0;
        StringBuilder str = new StringBuilder(s);
        s=str.reverse().toString();
        for(int i=0;i<s.length();i++){
            if('0' != s.charAt(i)){
                break;
            }else {
                count++;
            }
        }
        return count;
    }
}
