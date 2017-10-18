package cn.edu.tsinghua.javase.collecton;

import java.util.Scanner;

public class ToStringTest {
    public static void main(String[] args) {
//        toString object中的方法 返回对象的哈希码转化成16进制
        Scanner scanner=new Scanner(System.in);
        System.out.println(scanner.toString());
        scanner.hashCode();
    }
}
