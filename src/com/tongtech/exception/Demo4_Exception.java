package com.tongtech.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/28 11:36
 */
public class Demo4_Exception {
    /*
    *A:编译时期异常和运行期异常的区别
    *   Java中的异常别分为两类：编译时异常和运行时异常
    *   所有的RuntimeException类及其子类的实例被称为运行时异常，其他异常就是编译时异常
    *   编译时异常：
    *       java程序必须显示处理，否则程序就会发生错误，无法通过编译
    *   运行时异常：
    *       无需显示处理，也可以和编译时异常一样处理
    * B：案例演示
    *    编译期异常和运行期异常的区别
    * 编译时异常也叫未雨绸缪异常（自己定义的）
    *    未雨绸缪:在做某些事情的时候做某些准备
    *    编译时异常:在编译某个程序时，有可能会有这样的事情发生，比如文件找不到。这样的异常就必须在编译的时候处理
    *  如果不处理编译就通不过
    *    运行时异常：就是程序员所犯的错误，需要回来修改代码
    * */
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("mhj.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}












