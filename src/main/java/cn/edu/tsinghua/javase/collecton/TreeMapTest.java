package cn.edu.tsinghua.javase.collecton;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
public static void main(String[] args) {
    TreeMap<Integer, String> map = new TreeMap<>();
    map.put(1, "hi");
    map.put(-1, "hello");
    map.put(99, "abcd");

    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + "->" + entry.getValue());
    }



}
}
