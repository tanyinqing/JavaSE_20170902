package cn.edu.tsinghua.javase.generic;

import java.util.Vector;

public class GenericTest<T> {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
   //运用泛型使方法变成通用的
    public String cancat(T x,T y){
        return String.valueOf(x)+String.valueOf(y);
    }

    public static void main(String[] args) {
//   generic 通用的 泛化的类型 general  一般的
        GenericTest<Integer> genericTest=new GenericTest();
        System.out.println(genericTest.cancat(1,2));

        GenericTest<Double> genericTest1=new GenericTest();
        System.out.println(genericTest1.cancat(1.00,9.00));
       // System.out.println(genericTest.cancat(true,"jjj"));

        //泛型定义了集合中元素的类型
        Vector<String> vector=new Vector();
        vector.add("hi");
        vector.add("hello");
        System.out.println(vector.size());
        String s= (String) vector.get(0);
        System.out.println(s);
}
}
