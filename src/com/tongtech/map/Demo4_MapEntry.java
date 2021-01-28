package com.tongtech.map;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/25 19:27
 */
public class Demo4_MapEntry {
    /*
    * 解释一个Map.Entry
    * */
    public static void main(String[] args) {

    }

}
interface Inter{
    interface Inter1{
        public void show();
    }
}
class Demo implements Inter.Inter1{
    @Override
    public void show() {
        System.out.println("doctor");
    }
}
