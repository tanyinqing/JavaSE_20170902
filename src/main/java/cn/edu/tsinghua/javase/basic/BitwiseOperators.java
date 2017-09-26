package cn.edu.tsinghua.javase.basic;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 16:13 17 Sep 2017
 */
public class BitwiseOperators {
    public static void main(String[] args) {
        int x = -1;
        int y = 0;
        int z = x & y; // x 按位与 y
        z = x | y;
        z = x ^ y;
        z = ~x;
        z = x << 2;
        z = x >>> 1;
//        z = x >> 1;

        // binary  0 1 10
        // decimal 0 1 2
        // 世界上有10种人，懂二进制的和不懂的

        // 0001
        // 0000
        // 0000
        // 0001
        // 0001
        // 0010
        // 0100

        // 0100
        // 0010

        //  01111111111111111111111111111111 2^31-1
        System.out.println(Integer.toBinaryString(-1));

        System.out.println(z);
    }
}
