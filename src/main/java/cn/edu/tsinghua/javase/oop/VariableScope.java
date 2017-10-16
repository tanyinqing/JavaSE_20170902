package cn.edu.tsinghua.javase.oop;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 15:07 14 Oct 2017
 */
public class VariableScope {

    /**
     *
     */
    public void m() {
        i = 0;
        test(1d);
    }

    private static int i;

    public static void test(double d) {
        System.out.println(d);
        String s = "hi"; // local variable
        System.out.println(s);
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

//        int i = 10000;

        System.out.println(i);
    }

    public static void main(String[] args) {
        test(1d);
    }
}