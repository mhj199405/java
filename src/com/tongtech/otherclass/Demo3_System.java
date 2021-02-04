package com.tongtech.otherclass;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/15 17:19
 */
public class Demo3_System {
    /*
    * A：System类的概述
    *   System类包含一些有用的类字段和方法。它不能被实例化
    * B: 成员方法
    *   public static void gc()
    *   public static void exit(int status)()
    *   public static long currentTimeMillis()
    *   public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
    * */
    public static void main(String[] args) {
        //demo1();
        //demo2();
         int[] arr={1,2,3,4,5,6};
         int[] dest=new int[arr.length];
         for(int i=0;i<dest.length;i++){
             System.out.println(dest[i]);
         }
        System.out.println("------------------");
        System.arraycopy(arr,0,dest,0,arr.length);  //数组内容拷贝
        for(int i=0;i<dest.length;i++){
            System.out.println(dest[i]);
        }
    }
    public static void demo3(){
        long start = System.currentTimeMillis();   // 1秒等于1000
        for(int i=0;i<10;i++){
            System.out.print("*");
        }
        System.out.println();
        long end = System.currentTimeMillis();  // 获取当前的毫秒值
        System.out.println(end-start);
    }
    public static void demo2(){
        System.exit(0); //非0状态是异常终止，退出jvm
        System.out.println("23333333333");
    }
    public static void demo1(){
        for(int i=0;i<10;i++){
            new Demo();
            System.gc();            //相当于调用垃圾回收器
        }
    }
}
class Demo{ //在一个源文件中不允许定义两个用public修饰的类

    @Override
    public void finalize(){
        System.out.println("垃圾被回收了");
    }
}
















