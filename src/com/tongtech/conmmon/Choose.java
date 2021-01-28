package com.tongtech.conmmon;

import java.util.Arrays;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/20 16:25
 */
public class Choose {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 8, 7, 9, 4, 1, 5, 0 };
        int[] sort = sort(arr);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort (int[] sourcearry) {
        //将参数里的数组复制到新声明的一个数组中
        int[] arr = Arrays.copyOf(sourcearry, sourcearry.length);
        //比较次数为N-1次
        for(int i=0;i<arr.length-1;i++) {
            int min = i;
            //每轮需要N-i次比较
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[min]) {
                    //记录目前找到的最小元素的下标
                    min = j;
                }
            }
            //找到的最小值与当前i位置元素值交换
            if(i!=min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        return arr;
    }
}
