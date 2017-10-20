package cn.edu.tsinghua.javase.collecton;

import java.util.ArrayList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (int i = 0; i < 1000000; i++) {
//            linkedList.add(i);
//        }

        long begin = System.nanoTime();
//        arrayList.remove(arrayList.size() - 1);
//        linkedList.remove(linkedList.size() - 1);

        System.out.println(arrayList.get(arrayList.size() / 2));
//        System.out.println(linkedList.get(linkedList.size() / 2));
        System.out.println(System.nanoTime() - begin);
    }
}
