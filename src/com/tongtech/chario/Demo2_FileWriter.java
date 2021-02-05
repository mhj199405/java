package com.tongtech.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/5 10:08
 */
public class Demo2_FileWriter {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       demo1();
    }
    public static void demo1() throws IOException{
        FileWriter fw = new FileWriter("xie.txt");
        fw.write("我是米海军，毕业于2019年7月份，学习的专业是计算机专业");
        fw.write(97);
        fw.close();
    }
}
