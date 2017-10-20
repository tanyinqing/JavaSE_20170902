package cn.edu.tsinghua.javase.collecton;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("北京");
        strings.add("你好");
        strings.add("广州");
        strings.add("上海");
        strings.add("一");

        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }

        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("中");
        System.out.println(strings1.get(0));

        char c1 =  '上';
        char c2 =  '你';
        char c3 =  '北';
        char c4 =  '广';
        System.out.println((int)c1);
        System.out.println((int)c2);
        System.out.println((int)c3);
        System.out.println((int)c4);
        System.out.println((int)'一');
    }
}
