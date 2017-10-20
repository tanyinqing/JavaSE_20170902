package cn.edu.tsinghua.javase.collecton;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IiteratorTest {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
    //    ListIterator  是否有下一个元素 继承接口
//    Iterator
public static void main(String[] args) {
    //        ListIterator
//        Iterator 迭代器\ [ɪtə'reɪtə]

//        List Set

    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);

    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(0));
    }
    System.out.println("---");
    for (Integer integer : list) {
        System.out.println(integer);
    }
    System.out.println("---");
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }

    System.out.println(iterator);

}
}
