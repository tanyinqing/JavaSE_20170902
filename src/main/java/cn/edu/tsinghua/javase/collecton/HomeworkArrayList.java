package cn.edu.tsinghua.javase.collecton;

import java.util.ArrayList;
import java.util.Vector;

public class HomeworkArrayList {
    //求得ArrayList 对象的容量
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        strings.add("hi");
        strings.add("hello");
        System.out.println(strings.size());
    }
}
