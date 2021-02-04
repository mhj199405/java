package com.tongtech.collecctions;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/27 11:26
 */
public class Demo1_Collections {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("m");
        arrayList.add("f");
        arrayList.add("c");
      /*  System.out.println(Collections.binarySearch(arrayList,"h"));
       Collections.reverse(arrayList);*/
//        Collections.sort(arrayList);
        /*System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));*/
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
