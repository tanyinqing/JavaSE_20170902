package cn.edu.tsinghua.javase.exception;


import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:31 23 Oct 2017
 */
public class CheckedExceptionTest {

    public void method() throws FileNotFoundException {

    }

    public void m1() {
        try {
            method();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void m2() {
        m1();
    }

    public static void main(String[] args) { // JVM

        CheckedExceptionTest test = new CheckedExceptionTest();
        test.m2();

        Scanner scanner = new Scanner(System.in);
        System.out.println("input file name: ");
        String file = scanner.nextLine();
//        System.out.println(file);

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r"); //  read write
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("done.");

        // FileNotFoundException -> Checked Exception 不可控的
        // IllegalArgumentException -> Unchecked Exception 程序的bug
    }
}