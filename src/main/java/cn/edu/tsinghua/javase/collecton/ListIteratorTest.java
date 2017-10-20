package cn.edu.tsinghua.javase.collecton;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
public static void main(String[] args) {
    List<Integer>list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    ListIterator<Integer>listIterator=list.listIterator();
    while (listIterator.hasNext()) {
        Integer next = listIterator.next();
        System.out.println(next);
    }
    while (listIterator.hasPrevious()) {
        Integer next =  listIterator.previous();
        listIterator.nextIndex();
        System.out.println(listIterator.previousIndex());


    }

}
}
