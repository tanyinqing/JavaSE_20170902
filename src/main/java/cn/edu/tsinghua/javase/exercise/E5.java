package cn.edu.tsinghua.javase.exercise;

import java.util.Scanner;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 10:54 23 Sep 2017
 */

// 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
public class E5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input int score: ");

        int score = scanner.nextInt();

        System.out.println((score >= 90) ? 'A' : ((score >= 60) ? 'B' : 'C'));
    }
}
