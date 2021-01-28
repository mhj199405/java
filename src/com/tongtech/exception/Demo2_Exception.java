package com.tongtech.exception;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/27 20:39
 */
public class Demo2_Exception {
    /*
    *  A:异常处理的两种方式
    *    a:try..catch...finally
    *        try catch
    *        try catch finally
    *        try finally
    *  B:try...catch处理异常的基本格式
    *        try...catch..finally
    *  C：案例演示
    *        try...catch的方式处理1个异常
    *   try：用来检测异常的
    *   catch：用来捕获异常的
    *  finally:释放资源
    * 当通过try catch将问题处理了，程序会继续执行
    * */
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        try{
            int i = demo1.div(10, 0);
            System.out.println(i);
        }catch (ArithmeticException e){ // ArithmeticException e=new ArithmeticException
            System.out.println("妈了个巴子");
        }
        System.out.println(111);
    }

}
class Demo1{
    public int div(int a,int b){
        return a/b;
    }
}












