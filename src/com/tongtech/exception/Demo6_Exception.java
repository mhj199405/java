package com.tongtech.exception;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/28 18:39
 */
public class Demo6_Exception {
   /*
   * A:throws的方式处理异常
   *     定义功能方法时，需要把出现的问题暴露出来让调用者去处理
   *     那么就通过throws在方法上标示
   * B:案例演示：
   *     举例分别演示编译时异常和运行异常的抛出
   *     编译时异常的抛出必须对其进行处理
   *     运行时异常的抛出可以处理也可以不处理
   * */
    public static void main(String[] args)throws ArithmeticException,RuntimeException {
        Person person = new Person();
        person.setAge(160);
        System.out.println(111);
    }
}
class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        if(age<0 && age<150){
            this.age = age;
        }else{
            throw  new ArithmeticException("年龄非法");
        }

    }
}
