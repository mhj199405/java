package com.tongtech.otherio.test1;

import java.util.ArrayList;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/13 1:04
 */
public class Test8 {
    /*
    * 获取幸运数字
    *   1、返回值类型为int
    *   2、参数列表为 int num
    *
    * */
    public static void main(String[] args) {
        int luck = getLuck(8);
        System.out.println(luck);
    }
    public static int getLuck(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1;i<=num;i++){
            list.add(i);
        }
        int count=1;
        for (int i=0;list.size()!=1;i++){
            if(i == list.size()){
                i=0;
            }
            if(count%3==0){
               list.remove(i--);
            }
            count++;
        }
         return list.get(0);
    }
}
