package com.tongtech.set.bean;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/21 20:51
 */
public class Person implements Comparable<Person>{
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
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
   /*
   * 当hashcode值一样的时候，才会调用equals方法
   * */
   /* @Override
    public boolean equals(Object obj) {
        System.out.println("执行了？");
        Person p=(Person)obj;
        return this.name.equals(p.name)&&this.age==p.age;
    }

    @Override
    public int hashCode() {
        return age;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  //调用的对象和传入的对象是同一对象
        if (!(o instanceof Person)) return false;

        Person person = (Person) o; //向下转型

        if (age != person.age) return false;
        return name.equals(person.name);
    }
    /*
 *  为什么是31
 *  1、31是一个质数，自能被1和自身整除
 *  2、31这个数既不大也不小
 *  3、31这个数好算，2的五次方-1，2向左移动5位
 * public int hashCode() {
      int h = hash;
      if (h == 0 && value.length > 0) {
          char val[] = value;

          for (int i = 0; i < value.length; i++) {
              h = 31 * h + val[i];
          }
          hash = h;
      }
      return h;
  }
 * */
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
   /*
   * 按照年龄排序，年龄相等，再按照姓名排序
   * */
   /* @Override
    public int compareTo(Person o) {
        int num=this.age-o.age;   //年龄是比较的主要条件
        return num==0 ? this.name.compareTo(o.name) : num ; //姓名是比较的次要条件
    }*/
    /*
    * 按照姓名排序
    * */
    /*@Override
    public int compareTo(Person o) {
        int num=this.name.compareTo(o.name); //姓名是主要条件
        return num==0 ? this.age-o.age : num; //年龄是次要条件
    }*/

    @Override
    public int compareTo(Person o) {
        int length=this.name.length()-o.name.length(); //比较name长度为主要条件
        int num=length == 0 ? this.name.compareTo(o.name)  : length; //比较内容为次要条件
        return num == 0? this.age-o.age : num;//比较年龄为次要条件
    }
}
