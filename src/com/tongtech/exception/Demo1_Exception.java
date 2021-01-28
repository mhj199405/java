package com.tongtech.exception;

import java.lang.ref.PhantomReference;
import java.lang.ref.WeakReference;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/27 19:43
 */
public class Demo1_Exception {
    public static void main(String[] args) {
     /* for(int i=0;i<100;i++){
          new Demo();
      }
        System.gc();*/
        int arr[]={11,4,7,89,90};
        arr=null; //NullPointerException空指针异常
        //System.out.println(arr[12]);
       // System.out.println(arr[10]); //ArrayIndexOutOfBoundsException数组索引越界异常
        Demo demo = new Demo();
        int i = demo.div(10, 0);
        System.out.println(i);
    }
}
/*class Demo extends Exception{

    @Override
    protected void finalize() {
        System.out.println("dfdasfds");
    }
}*/
class Demo{
    public int div(int a,int b){ //a=10,b=0
        return a/b; //  10/0  被除数是10,除数是0的时候违背了算数
    }
}
