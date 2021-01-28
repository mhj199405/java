package com.tongtech.conmmon;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/20 10:43
 */
public class Son extends Father {
    int num=20;
    public void show(){
        int num=10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
