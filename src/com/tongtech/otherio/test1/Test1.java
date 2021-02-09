package com.tongtech.otherio.test1;

import java.io.File;
import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/9 11:56
 */
public class Test1 {
     /*
     * 需求：从键盘接收一个文件夹路径，统计该文件夹大小
     *
     * 从键盘接收一个文件夹路径
     * 1、创建键盘录入对象
     * 2、定义一个无限循环
     * 3、将键盘录入的结果存储并封装成File对象
     * 4、对File对象判断
     * 5、将文件夹路径对象返回
     * 统计该文件夹的大小
     * 1、定义一个求和变量
     * 2、获取文件夹下所有和文件夹listFiles();
     * 3、遍历数组
     * 4、判断是文件就和计算大小并累加
     * 5、判断是文件夹，递归调用
     *
     * */
    public static void main(String[] args) {
        /*File file = getFile();
        System.out.println(getFileLength(file));*/
        File file = new File("C:\\Users\\T470\\Desktop\\restfulcrud-实验\\corejava\\图片\\流\\递归");
        System.out.println(file.length());//直接获取文件夹的结果是0
    }
    public static File getFile(){
        //创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        //定义一个无线循环
        while (true){
            //将键盘录入的字符串存储为File对象
            String s = scanner.nextLine();
            File file = new File(s);
            //对File进行判断
            if(!file.exists()){
                System.out.println("您输入的路径不存在，请重新输入文件夹路径");
            }else if(file.isFile()){
                System.out.println("您输入的是文件路径，请输入文件夹路径");
            }else{
                //将文件夹对象返回
                return file;
            }
        }
    }
    public static long getFileLength(File dir){
        //定义一个变量求和
        long len=0;
        File[] files = dir.listFiles();
        for (File file:files){
            if(file.isFile()){
                len=len+file.length();
            }else {
                //判断是文件夹递归调用
                len=len+getFileLength(file);
            }
        }

        return len;
    }
}





