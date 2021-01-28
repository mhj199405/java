package com.tongtech.exception;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/28 11:12
 */
public class Demo3_Exception {
    /*
    * try后面如果跟多个catch，那么小的异常放在前面，大的异常放在后面，根据多态的原理，如果的放在前面，就会将所有的紫烈对象接收
    * 后面catch就没有意义了
    * */
    public static void main(String[] args) {
      int[] arr={1,233,34};
        try {
            arr=null;
            System.out.println(arr[10]);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e1) {
            System.out.println("出错了");
        } /*catch (ArrayIndexOutOfBoundsException e){
           catch (Exception e){
                System.out.println("出错了");
            } System.out.println("数组索引越界异常");
        } */
        System.out.println(11);
    }
}



