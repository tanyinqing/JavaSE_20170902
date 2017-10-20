package cn.edu.tsinghua.javase.collecton;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            strings.add(i + "");
        }
        System.out.println(strings.size());

        for (String string : strings) {
            System.out.println(string);
        }

//        System.out.println(strings.get());
    }
}
