package com.tongtech.chario.test;

import java.io.*;
import java.util.ArrayList;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/5 11:44
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
        * 对于流的使用，尽量是晚开早关
        * */
        //创建输入流对象
        BufferedReader br = new BufferedReader(new FileReader("mj.txt"));
        ArrayList<String> arrayList=new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null){
            //将读到的字符串存储到集合中
            arrayList.add(line);
        }
        br.close();
        //创建输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("revmj.txt"));
        //倒着遍历集合将数据写到文件中
        for (int i=arrayList.size()-1;i>=0;i--){
            bw.write(arrayList.get(i));
            bw.newLine();
        }
        bw.close();
    }
}
