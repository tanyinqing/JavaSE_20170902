package cn.edu.tsinghua.javase.exception;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ThrowTest {
    public void method() throws FileNotFoundException {
        throw new FileNotFoundException(); //
    }

    public void test() {
        try {
            method();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThrowTest throwTest = new ThrowTest();
        throwTest.test();

        System.out.println("done.");


        List<Integer> list = new ArrayList<>();
        list.add(1);

        System.out.println(list.get(-1));
    }
}

class MyException extends Exception {

}
