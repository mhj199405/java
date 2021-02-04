package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/22 18:49
 */
public class Demo1_Final {
    public static void main(String[] args) {
         new   Sons().print();
    }
}
/*
   *  final概述
   *   final是最终的
   *  final 修饰特点
   *    修饰类，表示这个类不能被继承
   *    修饰变量，表示这个变量是一个常量，只能赋值一次
   *    修饰方法，表示此方法不能被重写
  */
/*final class Fathers{
    public final  void print(){
        System.out.println("fdsajalkfjsakld");
    }
}*/
class Sons /*extends Fathers*/{
    final int MAX_NUM=10;  //  常量命名规则，如果是一个单词，所有字母都大写，如果是多个单词，每个单词都用大写，中间用下划线隔开
    public static final double PI=3.141596;  // final修饰的变量，一般叫常量，一般会和public static共用
    public void print(){

        System.out.println("fjsalkdfjsa"+MAX_NUM);
    }
}
