package com.tongtech.jdk5;
import  java.util.Arrays;
/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/21 14:58
 */
public class Demo2_StaticImport{
    /*
    * A；静态导入概述：
    *    静态导入时导入类中静态方法
    * B:格式
    *    import static 包名...类名.方法名;
    *    可以直接导入到方法的级别
    * C:注意事项
    *    方法必须是静态的，如果有多个同名的静态方法，容易不知道使用谁？这个时候就要使用，
    * 必须加前缀。由此可见，意义不大，所以一般不用，但是哟啊看的懂
    * 静态导入开发不用，但是需要能看得懂
    * */
    public static void main(String[] args) {
       int[] arr={34,-3,0,3,2,1};
       Arrays.sort(arr); //排序
        //System.out.println(Arrays.toString(arr));//将数组转换为字符串
    }
}


















