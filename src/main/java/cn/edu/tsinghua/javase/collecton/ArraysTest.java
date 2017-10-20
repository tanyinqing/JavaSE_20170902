package cn.edu.tsinghua.javase.collecton;

import java.util.Arrays;

public class ArraysTest {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
public static void main(String[] args) {
 int[] ints = {1, -1, 100, 1000, -10000};
 Arrays.sort(ints); // *****
 System.out.println(Arrays.toString(ints));
 System.out.println(Arrays.binarySearch(ints, -10000)); // 二分查找

//        Arrays.fill(ints, 1); // fill 填满\ [fɪl]
 Arrays.sort(ints);
 for (int anInt : ints) {
  System.out.println(anInt);
 }

 System.out.println(Arrays.toString(ints));

 int[][] ints1 = {
         {1, -1, 10},
         {-2, -3},
         {3, 2, 1, 0}
 };
 System.out.println(Arrays.deepToString(ints1));
}
}
