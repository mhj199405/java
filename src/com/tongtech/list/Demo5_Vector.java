package com.tongtech.list;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/20 14:34
 */
public class Demo5_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("a");
        v.addElement("b");
        v.addElement("c");
        v.addElement("d");
        //System.out.println(v.toString());
        Enumeration e = v.elements(); //获取枚举
        while(e.hasMoreElements()){ //判断集合中是否有元素
            System.out.println(e.nextElement()); // 获取集合中的元素
        }
    }
}
