package com.tongtech.otherclass;

import java.math.BigDecimal;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/15 18:46
 */
public class Demo5_BigDecimal {
    /*
    *A:BigDecimal的概述
    *   由于在运算的时候，float类型和double类型和容易丢失精度，
    *   所以，为了精确的表示，计算浮点，java提供了BigDecimal
    *   不可改变，任意精度的有符号十进制数
    *B：构造方法
    *    public BigDecimal(String val)
    *C：成员方法
    *  public BigDecimal add(BigDecimal augend)
    *  public BigDecimal subtract(BigDecimal subtract)
    *  public BigDecimal multiply(BigDecimal multiply)
    *  public BigDecimal divide(BigDecimal divisor)
    * D：案例演示
    *   BigDecimal类的构造方法和成员方法的使用
    *
    * */
    public static void main(String[] args) {
        System.out.println(2.0-1.1);
        BigDecimal bd1 = new BigDecimal(2.0);    //这种方式
        BigDecimal bd2 = new BigDecimal(1.1);
        System.out.println(bd1.subtract(bd2));


        BigDecimal bd11 = new BigDecimal("2.0");  // 通过构造中传入字符串的方式，开发时推荐
        BigDecimal bd22 = new BigDecimal("1.1");
        System.out.println(bd11.subtract(bd22));


        BigDecimal decimal1 = BigDecimal.valueOf(2.0);  //这种方式开发时，也推荐使用
        BigDecimal decimal2 = BigDecimal.valueOf(1.1);
        System.out.println(decimal1.subtract(decimal2));
    }
}

















