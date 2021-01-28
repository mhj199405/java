package com.tongtech.set.test;

import com.tongtech.set.bean.Student;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/23 17:21
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的成绩的格式是：姓名,语文成绩,数学成绩,英语成绩");
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num=o2.getSum()-o1.getSum();
                return num == 0 ? 1 : num;
            }
        });
        while (ts.size()<5){
            String s = scanner.nextLine();
            String[] str = s.split(",");
            int chinese=Integer.parseInt(str[1]);
            int math=Integer.parseInt(str[2]);
            int english=Integer.parseInt(str[3]);
            ts.add(new Student(str[0],chinese,math,english));
        }
        System.out.println("排序后的学生信息");
        Iterator<Student> it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
