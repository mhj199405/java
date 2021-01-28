package com.tongtech.stringbuffer;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/8 16:16
 */
public class Demo2_Array {
    public static void main(String[] args) {
       int arr[]={1,2,44,55,66,77,78};
        System.out.println(getIndex(arr,44));
        System.out.println(getIndex(arr,66));
        System.out.println(getIndex(arr,77));
    }
    public static int getIndex(int[] arr,int value){
        int min=0;
        int max=arr.length-1;
        int mid=(min+max)/2;
        while (arr[mid]!=value){  //当中间值不等于要找的值，就开始循环查找
            if(arr[mid]<value){  // 当中间值小于要查找的值
              min=mid+1;        // 最小索引改变
            }else if(arr[mid]>value){ //当中间值大于要查找的值
              max=mid-1;       //最大索引改变
            }
            mid=(min+max)/2;  // 无论是最大还是最小改变，中间的索引都会改变
            if(min>max){  // 如果最小索引大于最大索引，就没有查找的可能性了
                return -1;
            }
        }
        return mid;
    }
}

