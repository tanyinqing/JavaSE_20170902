package cn.edu.tsinghua.javase.basic;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 14:48 17 Sep 2017
 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 19;
        int y = -100;

        int z = x + y;
        z = x - y;
        z = x * y;
        z = x / y;
        z = x % y; // mod 求余

        System.out.println(z);
//        System.out.println(++z);

        System.out.println("3" + 1 + 2);

        // 规范 > 可读性
    }
}
