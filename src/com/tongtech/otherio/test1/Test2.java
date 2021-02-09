package com.tongtech.otherio.test1;

import java.io.File;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/9 14:53
 */
public class Test2 {
    public static void main(String[] args) {
        File file = Test1.getFile();
        deleteFile(file);
    }
    public static void deleteFile(File file){
        File[] files = file.listFiles();
        for (File file1:files){
            if(file1.isFile()){
                file1.delete();
            }else{
                deleteFile(file1);
            }
        }
        file.delete();//循环结束后把空文件删除
    }
}
