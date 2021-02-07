package com.tongtech.chario.test;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/7 15:44
 */
public class Test2 {
    /*
    * 获取一个文本上每一个字符出现的次数，将结果卸载times.txt上
    * 分析：
    *   1、创建带缓冲的输入流对象
    *   2、创建双列集合对象TreeMap
    *   3、将读到的字符存储在双列集合中国，存储的时候要做判断，如果不包含这个键，就将键和1存储，如果包含这个键，
    * 就将键和值加1存储
    *   4、关闭输入流
    *   5、创建输出流对象
    *   6、遍历集合将集合中的内容写到times.txt中
    *   7、关闭输出流
    * */
    public static void main(String[] args) throws IOException {
       //创建带缓冲的输入流对象
        BufferedReader br = new BufferedReader(new FileReader("zz.txt"));
       //创建双列集合TreesMap
        TreeMap<Character, Integer> tm = new TreeMap<>();
        //将读到的字符存储在双列集合中国，存储的时候要做判断，如果不包含这个键，就将键和1存储，如果包含这个键，就将键和值加1存储
        int ch;
        while ((ch=br.read())!=-1){
            char c=(char) ch;
           /* if(!tm.containsKey(c)){
               tm.put(c,1);
            }else {
                tm.put(c,tm.get(c)+1);
            }*/
            tm.put(c,!tm.containsKey(c) ? 1 : tm.get(c)+1);
        }
        //关闭输入流
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
        /*for (Character key:tm.keySet()){
            bw.write(key+"=="+tm.get(key));
            bw.newLine();
        }*/
        Set<Character> characters = tm.keySet();
        Iterator<Character> iterator = characters.iterator();
        while (iterator.hasNext()){
            Character key = iterator.next();
            Integer  value = tm.get(key);
            switch (key){
                case '\t':
                    bw.write("\\t"+"="+value);
                    break;
                case '\n':
                    bw.write("\\n"+"="+value);
                    break;
                case '\r':
                    bw.write("\\r"+"="+value);
                    break;
                default:
                    bw.write(key+"="+value);
                    break;
            }
            bw.newLine();
        }
        bw.close();

    }
}











