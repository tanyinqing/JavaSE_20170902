package cn.edu.tsinghua.javase.collecton;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SingLetonListVsArrayList {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
public static void main(String[] args) {
    String[] strings = {"hi", "hello"};
    List<String> list = Arrays.asList(strings); // 使数组快速变成一个列表

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
        String next = iterator.next();
        System.out.println(next);
    }

    list = Collections.singletonList("test");

    for (String s : list) {
        System.out.println(s);
    }

    System.out.println(list.size());

}
}
