package cn.edu.tsinghua.javase.oop;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 11:27 24 Sep 2017
 */
public class Test extends Object {

    public void test() {
        System.out.println("oop InputStreamTest class...");
    }

    public static void main(String[] args) {
        AccessModifierTest accessModifierTest = new AccessModifierTest();
//        System.out.println(accessModifierTest.i);
        System.out.println(accessModifierTest.d);
        System.out.println(accessModifierTest.b);
        System.out.println(accessModifierTest.s);

//        accessModifierTest.m1();
        accessModifierTest.m2();
        accessModifierTest.m3();
        accessModifierTest.m4();


        Calculator calculator = new Calculator();
//      calculator.y = 0;

        calculator.setX(100);
        calculator.setY(10);

        System.out.println(calculator.getY());

        System.out.println(calculator.divide());

        System.out.println("done.");
    }


}
