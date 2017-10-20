package cn.edu.tsinghua.javase.collecton;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
public static void main(String[] args) {
    LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
    map.put(1, "hi");
    map.put(-1, "hello");
    map.put(999, "hi");

    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + "->" + entry.getValue());
    }

}
}
