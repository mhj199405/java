package com.tongtech.arrays;

import java.util.Arrays;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/12 15:34
 */
public class Demo3_Arrays {
    public static void main(String[] args) {
        int[] arr={12,23,34,55,66,77};
        //System.out.println(Arrays.toString(arr)); //把数组转化为字符串
        Arrays.sort(arr); // 对数组进行排序
        /*
            public static String toString(int[] a) {
            if (a == null)         // 如果传入的数组是null
                return "null";     // 返回null
            int iMax = a.length - 1;//iMax最大索引
            if (iMax == -1)         //如果数组中没有元素
                return "[]";        // 返回[]

            StringBuilder b = new StringBuilder(); //线程不安全，效率高
            b.append('[');                   //将[添加到字符串缓冲区中
            for (int i = 0; ; i++) {         // 遍历数组，判断语句没有写默认是true
                b.append(a[i]);              // 把第一个字符串添加进字符串缓冲区
                if (i == iMax)               //如果索引等于了最大索引
                    return b.append(']').toString(); //将]添加到字符串缓冲区，并且转换成字符串返回
                b.append(", ");              // 如果不等于最大索引就将,添加到字符串缓冲区
            }
        * */
        System.out.println(Arrays.toString(arr));
        /*
          private static int binarySearch0(int[] a, int fromIndex, int toIndex, int key) {
                int low = fromIndex;
                int high = toIndex - 1;
                while (low <= high) {
                    int mid = (low + high) >>> 1;
                    int midVal = a[mid];
                    if (midVal < key)
                        low = mid + 1;
                    else if (midVal > key)
                        high = mid - 1;
                    else
                        return mid; // key found
                }
                return -(low + 1);  // key not found.
            }
        * */
        System.out.println(Arrays.binarySearch(arr,10)); //使用二分法查找某个整数的索引
    }
}



















