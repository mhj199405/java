package com.tongtech.abstracts;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/25 11:55
 */
public class Test2_Employee {
    public static void main(String[] args) {
        Coder coder = new Coder("张三", "324234", 12547);
        coder.work();
        Manager manager = new Manager("李四", "007", 14725, 325146);
        manager.work();
    }
}
abstract class Employee{
    private String name;
    private String id;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public abstract void work();
}
class Coder extends Employee{
    public Coder(String name,String id,double salary) {
        super(name,id,salary);
    }
    public void work(){
        System.out.println("我是："+this.getName()+",我的工号："+this.getId()+",我的工资:"+this.getSalary()+"元");
    }
}
class Manager extends Employee{
    private double donons;
    public Manager(String name, String id, double salary,double donons) {
        super(name, id, salary);
        this.donons=donons;
    }

    public void work(){
        System.out.println("我是："+this.getName()+",我的工号："+this.getId()+",我的工资:"+this.getSalary()+"元"+",我的奖金:"+this.donons);
    }
}