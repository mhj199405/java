package com.tongtech.enums;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/5 10:11
 */
public class Enum_Test {
    public static void main(String[] args) {
        Color[] colors = Color.values();
        Color red = Color.valueOf("RED");
        System.out.println(red);
        for(Color c:colors){
            System.out.println(c+"-----"+c.ordinal());
        }
    }
}
enum Color{
    RED,GREEN,BLUE;
}

