package com.tongtech.generic;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/20 20:25
 */
public class Tool<Q> {
    /*
    * Q是创建对象的时候赋值
    * */
    private Q q;

    public Object getObj() {
        return q;
    }

    public void setObj(Q q) {
        this.q = q;
    }
    public void show (Q q){ //方法的泛型最好和 类的泛型一致
        System.out.println(q); // 如果不一致需要在方法上声明泛型
    }
    public<T> void play(T t){
        System.out.println(t);
    }
    public static<W> void print(W w){ //静态方法必须声明自己的泛型
        System.out.println(w);
    }
}
