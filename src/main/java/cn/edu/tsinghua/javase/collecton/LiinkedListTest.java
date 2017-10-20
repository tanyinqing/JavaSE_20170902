package cn.edu.tsinghua.javase.collecton;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LiinkedListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ListIterator<Integer> listIterator = list.listIterator();
//这个是向后遍历
        while (listIterator.hasNext()) {
            Integer next =  listIterator.next();
            System.out.println(next);
        }
        System.out.println("下面是向前遍历");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}
