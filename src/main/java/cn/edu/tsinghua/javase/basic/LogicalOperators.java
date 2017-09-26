package cn.edu.tsinghua.javase.basic;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 15:45 17 Sep 2017
 */
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean c = a & b;
        c = a | b;
        c = a ^ b; // 异或
        c = !a;
        c = a && b;
        c = a || b;
        System.out.println(c);

        int x = 1;
        int y = 0;

        boolean z = (x > y) || (x++ == y);

        System.out.println(z);
        System.out.println(x); // ?
    }
}
