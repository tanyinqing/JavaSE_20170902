package cn.edu.tsinghua.javase.basic;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 16:45 17 Sep 2017
 */
public class ConditionalOperators {
    public static void main(String[] args) {
        int x = 1;
        int y = 10;

        int z = (x > y) ? x + y : x - y; // 三目

        System.out.println(z);
    }
}
