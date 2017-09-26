package cn.edu.tsinghua.javase.basic;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 11:48 23 Sep 2017
 */
public class BreakTest {
    public static void main(String[] args) {
        test: // label
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break test;
                }
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
