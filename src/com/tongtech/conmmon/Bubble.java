package com.tongtech.conmmon;

import java.util.Arrays;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/20 15:12
 */
public class Bubble {
    public static void main(String[] args) {
            int[] arr = new int[] { 2, 8, 7, 9, 4, 1, 5, 0 };
            int[] arr1 = new int[] { 12, -8, 7, 9, 4, 1, 5, 0 };
            bubbleSort(arr);
            choose(arr1);
        }

    public static void bubbleSort(int[] arr) {
        //控制多少轮
        for (int i = 0; i <=arr.length-1; i++) {
            //控制每一轮的次数
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("冒泡排序"+Arrays.toString(arr));

    }
    public static void choose(int[] arr){
        for(int i=0;i< arr.length-1;i++){
           int min=i;
           for (int j=i;j< arr.length;j++){
               if(arr[min]>arr[j]){
                   min=j;
               }
           }
           if(min!=i){
               int temp=arr[min];
               arr[min]=arr[i];
               arr[i]=temp;
           }
        }
        System.out.println("选择排序"+Arrays.toString(arr));
    }
}
