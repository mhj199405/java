package com.tongtech.chario;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/7 16:56
 */
public class Demo8_Digui {
    /*
    * 递归：方法自己调用自己
    * */
    public static void main(String[] args) {
        int i = diGu(5);
        System.out.println(i);
    }
    public static int diGu(int m){
        if(m==1){
            return 1;
        }else {
            return m*diGu(m-1);
        }
    }
}
