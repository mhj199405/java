package com.tongtech.chario;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/5 11:59
 */
public class Demo5_LineNumberReader {
    public static void main(String[] args) throws IOException {
        LineNumberReader lnbr = new LineNumberReader(new FileReader("mj.txt"));
        String b;
        lnbr.setLineNumber(10); //读到时候是加1，也就是设置成10，开始从11开始读取
        while ((b=lnbr.readLine())!=null){
            System.out.println(lnbr.getLineNumber()+":"+b);
        }
        lnbr.close();
    }
}
