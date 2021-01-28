package com.tongtech.collecctions;

import com.tongtech.collecctions.bean.Demo_Student;
import com.tongtech.collecctions.bean.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/27 19:13
 */
public class Demo2_Genric {
    public static void main(String[] args) {
        //demo1();
        TreeSet<Student> ts = new TreeSet<>(new ComparbY());
        ts.add(new Student("张三",23));
        ts.add(new Student("李四",24));
        ts.add(new Student("王五",25));
        ts.add(new Student("赵六",26));
        //System.out.println(ts);

        TreeSet<Demo_Student> ts1 = new TreeSet<>(new ComparbY());
        ts1.add(new Demo_Student("张三",23));
        ts1.add(new Demo_Student("李四",24));
        ts1.add(new Demo_Student("王五",25));
        ts1.add(new Demo_Student("赵六",26));
        System.out.println(ts);
    }
    public static void demo1(){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",23));
        list.add(new Student("李四",24));
        list.add(new Student("王五",25));
        list.add(new Student("赵六",26));

        ArrayList<Demo_Student> list1 = new ArrayList<>();
        list1.add(new Demo_Student("张三",23));
        list1.add(new Demo_Student("李四",24));
        list1.add(new Demo_Student("王五",25));
        list1.add(new Demo_Student("赵六",26));
        list.addAll(list1);
        System.out.println(list);
    }
}
class ComparbY implements Comparator<Student> {
    /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.<p>
     * <p>
     * In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.<p>
     * <p>
     * The implementor must ensure that <tt>sgn(compare(x, y)) ==
     * -sgn(compare(y, x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>compare(x, y)</tt> must throw an exception if and only
     * if <tt>compare(y, x)</tt> throws an exception.)<p>
     * <p>
     * The implementor must also ensure that the relation is transitive:
     * <tt>((compare(x, y)&gt;0) &amp;&amp; (compare(y, z)&gt;0))</tt> implies
     * <tt>compare(x, z)&gt;0</tt>.<p>
     * <p>
     * Finally, the implementor must ensure that <tt>compare(x, y)==0</tt>
     * implies that <tt>sgn(compare(x, z))==sgn(compare(y, z))</tt> for all
     * <tt>z</tt>.<p>
     * <p>
     * It is generally the case, but <i>not</i> strictly required that
     * <tt>(compare(x, y)==0) == (x.equals(y))</tt>.  Generally speaking,
     * any comparator that violates this condition should clearly indicate
     * this fact.  The recommended language is "Note: this comparator
     * imposes orderings that are inconsistent with equals."
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     * first argument is less than, equal to, or greater than the
     * second.
     * @throws NullPointerException if an argument is null and this
     *                              comparator does not permit null arguments
     * @throws ClassCastException   if the arguments' types prevent them from
     *                              being compared by this comparator.
     */
    @Override
    public int compare(Student o1, Student o2) {
        int num=o1.getAge()-o2.getAge();
        return num==0 ? o1.getName().compareTo(o2.getName()) : num;
    }
}
