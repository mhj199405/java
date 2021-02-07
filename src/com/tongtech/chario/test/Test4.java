package com.tongtech.chario.test;

import java.io.File;
import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/7 17:42
 */
public class Test4 {
    /*
    * 需求：从键盘接收一个文件路径，打印出该文件夹下所有的.java文件
    * 分析：
    *  从键盘接收一个文件夹路径
    *  1、如果录入的是不存在，给与提示
    *  2、如果录入的是文件路径，给与提示
    *  3、如果是文件夹路径，直接返回
    *  打印出改文件下所有的.java文件
    *  1、获取到该文件路径下的所有的文件和文件夹，存储在File中
    *  2、遍历数组，对每一个文件或文件夹做判断
    *  3、如果是文件，并且后缀是.java的，就打印
    *  4、如果是文件夹，就递归调用
    * */
    public static void main(String[] args) {
        File dir = getDir();
        printFileJava(dir);
    }
    public static File getDir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        while (true){
            String s = scanner.nextLine();
            File file = new File(s);
            if(!file.exists()){
                System.out.println("您录入的文件夹不存在，请重新录入");
            }else if(file.isFile()){
                System.out.println("您输入的是一个文件路径，请重新输入文件夹路径");
            }else {
                return file;
            }
        }
    }
    /*
    * 获取文件夹路径下的所有.java文件
    * 1、返回值类型void
    * 2、参数列表File dir
    * */
    public static void printFileJava(File dir){
        //1、获取该文件夹路径下的所有文件夹和文件
        File[] files = dir.listFiles();
        //2、遍历数组，对俄米一个文件或文件夹做判断
        for (File file:files){
            //3、如果是文件，并且后缀是.java的，就打印
            if(file.isFile()&&file.getName().endsWith(".java")) {
                System.out.println(file);
            }else if(file.isDirectory()){
               printFileJava(file);
            }
        }
    }
}










