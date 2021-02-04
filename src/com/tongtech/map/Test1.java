package com.tongtech.map;

import java.util.HashMap;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/26 19:24
 */
public class Test1 {
    public static void main(String[] args) {
        String s="aaabbcccdddeefffgggggghhhjjjmmmm";
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c:chars){
          hm.put(c,!hm.containsKey(c) ? 1 : hm.get(c)+1);
        }
        for (Character key:hm.keySet()){
            System.out.println(key+"="+hm.get(key));
        }
    }
}
