package com.tongtech.otherio.test1;
/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/12 8:09
 */
public class Test5 {
    /*
    * 不死神兔
    *   故事的从西园1202年说起，话说有一位意大利青年，名叫斐波那契。
    * 在他的一部著作中提出了一个有趣的问题:假设有一对刚出生的小兔子一个月后就能长成大兔，再过一个月就能生成一对
    * 小兔子，并且此后每一个月都生出一对小兔子
    * 1 1 2 3 5 8 13 21
    * */
    public static void main(String[] args) {
       //demo1();
        int fun = getFun(9);
        System.out.println(fun);
    }
    public static void demo1(){
     /*   Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();*/
        //使用数组来做不死神兔
        int[] arr=new int[8];
        arr[0]=1;
        arr[1]=1;
        //遍历数组对其他元素赋值
        for (int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        //如何获取最后一个数
        System.out.println(arr[arr.length-1]);
    }
    //使用递归来实现斐波那契
    public static int getFun(int num){
        if(num == 1 || num == 2){
            return 1;
        }else {
            return getFun(num-1)+getFun(num-2);
        }
    }
}
