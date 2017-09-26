package cn.edu.tsinghua.javase.basic;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 16:31 17 Sep 2017
 */
public class AssignmentOperators {
    public static void main(String[] args) {
        int x = 1;
        x += 1; // x ?= n 等价于 x = x ? n;
        x = x + 1;

        x %= 1;

        System.out.println(x);

//        boolean a = true;
        int a = 1;
        a &= 1; // a = a & 1
//        001
//        001

        System.out.println(a);
    }
}
