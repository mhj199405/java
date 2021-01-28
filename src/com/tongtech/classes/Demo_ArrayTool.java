package com.tongtech.classes;

import java.util.Arrays;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/18 18:47
 */
public class Demo_ArrayTool {
    public static void main(String[] args) {
        int[] arr={12,78,12,-4,78,4,5,98};
//        ArrayTool arrayTool = new ArrayTool();
//        int max = arrayTool.getMax(arr);
//        System.out.println("数组的最大值："+max);
//        System.out.println("---------------------------");
//        arrayTool.print(arr);
//        System.out.println();
//        System.out.println("----------------------------");
//        arrayTool.revArray(arr);
//        arrayTool.print(arr);
        ArrayTool.print(arr);
        System.out.println();
        int max = ArrayTool.getMax(arr);
        System.out.println(max);

    }
}
