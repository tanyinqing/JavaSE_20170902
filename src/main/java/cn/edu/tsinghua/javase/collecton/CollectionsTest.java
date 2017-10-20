package cn.edu.tsinghua.javase.collecton;

import java.util.*;

public class CollectionsTest {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(-1);
    list.add(99);
    list.add(1);

//        Collections.reverse(list); // reverse 反向\ [rɪ'vɜːs]
    Collections.sort(list); // sort 排序\ [sɔːt]

    for (Integer integer : list) {
        System.out.println(integer);
    }

    System.out.println(Collections.singletonList(list)); //[[-1, 1, 99]]
    System.out.println("->" + list);//->[-1, 1, 99]
    System.out.println(Arrays.asList(list));//[[-1, 1, 99]]

    Map<Integer, String> map = new HashMap<>();
    map.put(-1, "hi");
    map.put(100, "hello");
    map.put(1, "abcd");

    System.out.println(Collections.singletonList(map));//[{-1=hi, 1=abcd, 100=hello}]
    System.out.println("->" + map);//->{-1=hi, 1=abcd, 100=hello}
    System.out.println(Arrays.asList(map)); //[{-1=hi, 1=abcd, 100=hello}]



}
}
