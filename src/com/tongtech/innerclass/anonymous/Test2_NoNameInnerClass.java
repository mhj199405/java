package com.tongtech.innerclass.anonymous;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/29 16:48
 */
public class Test2_NoNameInnerClass {
    public static void main(String[] args) {
      //Outer2.method().show(); //链式编程，每次调用方法后还能继续调用方法，证明调用方法返回的是对象
        Inter2 inter2= Outer2.method();
        inter2.show();
    }
}
interface Inter2{
    void show();
}
class Outer2{
   public static Inter2 method(){
      return new Inter2() {
          @Override
          public void show() {
              System.out.println("HelloWorld");
          }
      };
   }
}
