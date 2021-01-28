package com.tongtech.abstracts;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/23 18:27
 */
public class Demo3_葵花宝典 {
    public static void main(String[] args) {
       岳不群 a=new 岳不群();
        a.自宫();
    }
}
abstract class 葵花宝典{
    public abstract  void 自宫();
}
class 岳不群 extends 葵花宝典{
    public void 自宫(){
        System.out.println("用剑自宫");
    }
}
class 林平之 extends 葵花宝典{
    public void 自宫(){
        System.out.println("用绣花针");
    }
}
class 东方不败 extends 葵花宝典{
    public void 自宫(){
        System.out.println("用锤子，简直是变态");
    }
}

