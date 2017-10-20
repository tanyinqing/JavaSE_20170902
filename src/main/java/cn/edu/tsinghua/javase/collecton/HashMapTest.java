package cn.edu.tsinghua.javase.collecton;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "hi");
    map.put(null, "hi");
    map.put(1, null);
    map.put(null, null);

    System.out.println(map.size());

    System.out.println(map.get(null));
    System.out.println(map.get(1));

    for (Integer integer : map.keySet()) {
        System.out.println(integer + "->" + map.get(integer));
    }

    for (String s : map.values()) {
        System.out.println(s);
    }

    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + "->" + entry.getValue());
    }

}
}
