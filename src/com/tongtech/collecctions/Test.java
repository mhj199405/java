package com.tongtech.collecctions;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/27 13:08
 */
public class Test {
    public static void main(String[] args) {
        String[] s={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color={"红桃","黑桃","方片","梅花"};
        ArrayList<String> poker = new ArrayList<>();
        for(String s1:color){
            for(String s2:s){
                poker.add(s1.concat(s2));
            }
        }
        poker.add("大王");
        poker.add("小王");
        Collections.shuffle(poker); //发牌
        ArrayList<String> zhangsan = new ArrayList<>();
        ArrayList<String> lisi = new ArrayList<>();
        ArrayList<String> wangwu = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for(int i=0;i<poker.size();i++){
            //留三张底牌
            if(i>= poker.size()-3){
                dipai.add(poker.get(i));
            }else if(i%3==0){
                zhangsan.add(poker.get(i));
            }else if(i%2==0){
                lisi.add(poker.get(i));
            }else {
                wangwu.add(poker.get(i));
            }
        }
        System.out.println(zhangsan);
        System.out.println(lisi);
        System.out.println(wangwu);
        System.out.println(dipai);
    }
}
