package cn.edu.tsinghua.javase.basic;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 16:47 17 Sep 2017
 */
public class MiscOperators {
    public static void main(String[] args) {
        int x = -100;
        char c = (char) x; // [0, 65535] [-2147483648, 2147483647]
        System.out.println(c);

        int z = (1 + 2 - 3) / 4 % 5;
        System.out.println(z);
    }
}
