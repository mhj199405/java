package com.tongtech.exception.test;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/29 18:31
 */
public class Test1 {
    /*
    * A:面试题
    *   final,finally和finalize的区别
    *   final可以修饰类，不能被继承
    *    修饰方法，不能被重写
    *    修饰变量，只能赋值异常
    *   finally是try语句中的一个语句体，不能单独使用，用来释放资源
    *   finalize是一个方法，当垃圾回收确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。
    * B:面试题2
    *   如果catch里面有return语句，请问finally的代码还会执行吗？如果会，请问是在return前还是return后
    *
    * */
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.method()); //最终打印x的值是30
    }
}
class Demo{
    public int method(){
        int x=10;
        try {
            x=20;
            System.out.println(1/0);
            return x;
        } catch (Exception e) {
           x=30;
           return x;
        }finally {
            x=40;
            //return x ; //不要在finally写返回语句，因为finally的作用是为了释放资源，是肯定会执行的
                         // 如果在这里面写了返回语句，那么try和catch的结果都会被改变，所以不能这么写
        }
    }
}












