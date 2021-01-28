package com.tongtech.innerclass.locality;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/29 11:11
 */
public class Demo1_InnerClasss {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
}
/**
 * 面向对象(局部内部类访问局部变量的问题)
 * 局部内部类，局部内部类只能在其所在的方法内部访问
 * A:案例演示
 *局部内部类访问局部变量必须用final修饰
 *局部内部咧在访问他所在方法中的局部变量必须用final修饰，为什么？
 *  因为当调用这个方法时，局部变量如果没有用final修饰，他的生命周期和方法的生命周期是一样的，当
 *方法弹栈，这个局部变量也会消失，那么如果局部内部类对象还没有马上消失想用这个局部变量，就没有了，
 *若果加上final修饰会在类加载的时候进入常量池，即使方法弹栈，常量池的常量还在，也可以继续使用
 *但是jdk1.8取消了这个事情，所以我任务这是个bug
 */

class Outer{
    public void method(){
         final int num=100;
        class Inner{
            public void print(){
                System.out.println("Hello World!"+num);
            }
        }
        Inner inner = new Inner();
        inner.print();
    }
}
















