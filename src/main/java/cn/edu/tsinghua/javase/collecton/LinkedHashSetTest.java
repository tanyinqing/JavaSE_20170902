package cn.edu.tsinghua.javase.collecton;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        for (int i = 0; i < 100; i++) {
            strings.add(i + "");
        }

        System.out.println(strings.size());
//        System.out.println(strings.get);

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
