package cn.edu.tsinghua.javase.exception;

import java.lang.reflect.Array;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:20 23 Oct 2017
 */
public class Test {
    public static void main(String[] args) {

//        int x = 1 / 0; // ArithmeticException

//        System.out.println("hi".charAt(2)); // StringIndexOutOfBoundsException

//        int[] ints = {1, 2, 3};
//        System.out.println(ints[3]); // ArrayIndexOutOfBoundsException

//        String s = "l23";
//        System.out.println(Integer.parseInt(s) - 1); // NumberFormatException

//        String s = "hi";
//        s = null;
//        System.out.println(s.indexOf('h')); // NullPointerException

        try {
            String s = "hi";
            s = null;
            System.out.println(s.indexOf('h')); // NullPointerException
            int i = 1 / 1;
            System.out.println("demo..."); //
            System.out.println("hi".charAt(2));
        } catch (Exception e) { // x
//            e
            // ...
            e.printStackTrace();
        } finally { // final
            System.out.println("finally...");
        }

        System.out.println("test");
    }
}

/*
java.lang.ArithmeticException: / by zero
	at cn.edu.tsinghua.javase.exception.InputStreamTest.main(InputStreamTest.java:26)
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at cn.edu.tsinghua.javase.exception.InputStreamTest.main(InputStreamTest.java:26)
 */