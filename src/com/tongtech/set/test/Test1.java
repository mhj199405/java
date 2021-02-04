package com.tongtech.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/22 11:43
 */
public class Test1 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Object> hs = new HashSet<>();
        while (hs.size()<10){
            hs.add(r.nextInt(20)+1);
        }
        Iterator<Object> it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
