package cn.edu.tsinghua.javase.basic;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 13:29 17 Sep 2017
 */
public class DataType {
    public static void main(String[] args) {
        boolean b = false;
        b = true;
        System.out.println(b);

        byte b1 = 1; // 1024 = 1KB 1024T = 1PB  bit 比特 1 0
        System.out.println(b1);

        char c = '中'; // 97;
        System.out.println(c);

        short s = 100;
        int i = 999;
        long l = 10000L;

        System.out.println(s + i + l);

        float f = 1.2f;
        double d = 1.2345;
        System.out.println(f);
        System.out.println(d);

        String s1 = "test...中文。。。"; // class
        System.out.println(s1);

        String name = "zhangsan";
        int age = 18;
        double height = 1.7;
        boolean married = false;

        long test;
        test = 100;
        test = 1000;
        System.out.println(test);

        int x = -2147483648; // 2^31 - 1 (-2^31)
        System.out.println(x);

        long y = 2147483648L;
        System.out.println(y);

        char c1 = 65535; // character
        c1 = '&';
        c1 = '\107'; // 0-7 8^2*1 + 8^1*0 + 8^0*7
        c1 = '\u9fbb'; // Hx 0-9 a, b, c, d, e, fibonacci [4E00, 9FBB]
        c1 = '\\'; // table
        System.out.print(c1); // ln = line
        System.out.print("test");

        String s2 = null;
        System.out.println(s2);
    }
}

/*
Shift+ Control + R 当前类
Control + R 上一次运行的类
Control + Option + R 选择
 */
