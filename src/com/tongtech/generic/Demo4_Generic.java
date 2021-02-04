package com.tongtech.generic;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/21 9:04
 */
public class Demo4_Generic {
    /*
    * A:泛型接口概述
    *    把泛型定义在接口上
    * B:定义格式
    *    public interface 接口名<泛型类型>
    * C:案例演示
    *    泛型接口的使用
    * */
    public static void main(String[] args) {

    }
}
interface Inter<T>{
 public void show(T t);
}
/*class Demo implements Inter<String> { //推荐使用这种
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}*/
class Demo1<T> implements Inter<T>{  //没有必要在实现接口的时候给自己类加泛型
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}



























