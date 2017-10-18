package cn.edu.tsinghua.javase.collecton;

import java.util.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:36 17 Oct 2017
 */
public class ArrayListTest extends ArrayList {
    // *****
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add("a");
            strings.add("a");
            strings.add("c");
        }

        System.out.println(strings.get(2));

        for (String string : strings) {
//            System.out.println(string);
        }

        System.out.println("--------->"+strings.size());

        for (int i = 0; i < strings.size(); i++) {
//            System.out.println(strings.get(i));
        }

        System.out.println(strings); // 没有get容量的方法，但有容量的概念

        ArrayList<Integer> integers = new ArrayList<>(100000);
        integers.add(1);
        integers.add(2);
        integers.add(3);

        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.addAll(integers);
        System.out.println(integers.contains(1));
        System.out.println("index: "+integers.indexOf(1));
//        integers1.remove(1);
//        integers1.clear();
        integers1.set(0, 3);
        System.out.println(integers1.isEmpty());
        for (Integer integer : integers1) {
            System.out.println(integer);
        }

        System.out.println(integers1.toString()); // ?

//        integers1.removeRange

        ArrayListTest arrayListTest = new ArrayListTest();
        for (int i = 0; i < 10; i++) {
            arrayListTest.add(i);
        }
        arrayListTest.removeRange(1, 9);
        for (Object o : arrayListTest) {
            System.out.println(o);
        }

        integers.trimToSize(); // capacity = size

        ArrayList<OverrideTest> overrideTests = new ArrayList<>();
        overrideTests.add(new OverrideTest());
        overrideTests.add(new OverrideTest());
        overrideTests.add(new OverrideTest());
        overrideTests.add(new OverrideTest());

        System.out.println(overrideTests.size()); // ?

        for (OverrideTest overrideTest : overrideTests) {
            System.out.println(overrideTest.hashCode());
        }

    }
}