package com.tongtech.otherclass;

import java.math.BigInteger;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/15 18:31
 */
public class Demo4_BIgInteger {
    /*
    * A：BigInteger的概述
    *   可以让超过Integer范围内的数据进行运算
    * B：构造方法
    *    public BigInteger(String val)
    * C：成员方法
    *    public BigInteger add(BigInteger val)
    *    public BigInteger subtract(BigInteger val)
    *    public BigInteger multiply(BigInteger val)
    *    public BigInteger divide(BigInteger val)
    *    public BigInteger[] divideAndRemainder(BigInteger val)
    * */
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("100");
        BigInteger b2 = new BigInteger("2");
        System.out.println(b1.add(b2));  //加法运算
        System.out.println(b1.subtract(b2));//减法运算
        System.out.println(b1.multiply(b2));//乘法运算
        System.out.println(b1.divide(b2));//除法运算
        BigInteger[] bs = b1.divideAndRemainder(b2);  //取除数和余数
        for(int i=0;i<bs.length;i++){
            System.out.println(bs[i]);
        }
    }
}















