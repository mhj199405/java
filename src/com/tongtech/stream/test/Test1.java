package com.tongtech.stream.test;

import java.io.*;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/3 19:44
 */
public class Test1 {
    /*
    * 将写出的字节异或上一个数，这个数就是秘钥，解密的时候再次异或就可以解密
    * */
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("copy1.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy2.jpg"));
        int i;
        while ((i=bis.read())!=-1){
            bos.write(i^123);
        }
        bis.close();
        bos.close();
    }
}
