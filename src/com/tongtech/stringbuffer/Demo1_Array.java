package com.tongtech.stringbuffer;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/8 11:38
 */
public class Demo1_Array {
    public static void main(String[] args) {
        int arr[] = {23, 2, -9, 2, 0};
        System.out.println("冒泡排序法：");
        System.out.println("排序之前:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("排序之后:");
        bubble(arr);
        System.out.println();
        System.out.println("选择排序法：");
        System.out.println("排序之前:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("排序之后:");
        choose(arr);


    }
/*
  这是冒泡排序的分析思路：
* int[] arr={1,6,-8,-3,0}
0第一次  arr[0]-arr[1] arr[1]-arr[2] arr[2]--arr[3] arr[3]--arr[4]   4   5-1
1第二次  arr[0]-arr[1] arr[1]-arr[2] arr[2]--arr[3]                  3   5-1-1
2第三次  arr[0]-arr[1] arr[1]-arr[2]                                 2   5-1-2
3第四次  arr[0]-arr[1]                                               3   5-1-3
* */
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
/*
*
*
*
*
*
*
* */
    public static void choose(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
