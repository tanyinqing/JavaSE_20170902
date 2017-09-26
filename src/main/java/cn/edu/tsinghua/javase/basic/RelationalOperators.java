package cn.edu.tsinghua.javase.basic;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 15:21 17 Sep 2017
 */
public class RelationalOperators {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        boolean z  = x > y;
        z = x < y;
        z = x >= y;
        z = x <= y;
        z = x == y;
        z = x != y;

        System.out.println(z);

        String s1 = "hello";
        String s2 = "Hello";

        System.out.println(s1 == s2); // ?

    }
}
