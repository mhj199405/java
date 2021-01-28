package com.tongtech.collecctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/27 16:45
 */
public class Test3 {
    public static void main(String[] args) {
        String[] num={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] color={"红桃","黑桃","方片","梅花"};
        int index=0;
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(String s1:num){
            for(String s2:color){
                hm.put(index,s2.concat(s1));
                list.add(index);
                index++;
            }
        }
        list.add(index);
        hm.put(index,"小王");
        index++;
        list.add(index);
        hm.put(index,"大王");
        //洗牌
        Collections.shuffle(list);
        TreeSet<Integer> zhansan = new TreeSet<>();
        TreeSet<Integer> lisi = new TreeSet<>();
        TreeSet<Integer> wangwu = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();
        for(int i=0;i<list.size();i++){
         if(i>= list.size()-3){
             dipai.add(list.get(i));
         }else if(i%3==0){
             zhansan.add(list.get(i));
         }else if(i%3==1){
             lisi.add(list.get(i));
         }else {
             wangwu.add(list.get(i));
         }
        }
        lookPoker(hm,zhansan,"张三");
        lookPoker(hm,lisi,"李四");
        lookPoker(hm,wangwu,"王五");
        lookPoker(hm,dipai,"底牌");
    }
    public static void lookPoker(HashMap<Integer,String> hm,TreeSet<Integer> ts,String name){
        System.out.print(name+"的牌是:");
        for(Integer i:ts){
            System.out.print(hm.get(i)+" ");
        }
        System.out.println();
    }
}
