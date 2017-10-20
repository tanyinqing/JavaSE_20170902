package cn.edu.tsinghua.javase.collecton;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Vector;

public class HomeworkArrayList {
    //求得ArrayList 对象的容量  反射机制  //反射机制取出类的域
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add("hi");
        }
        strings.add("hello");

        System.out.println(strings.size()); // 11

        // Object[] elementData;
        // length -> capacity;

        // class = field + method  //反射机制取出类的域
        Field field = ArrayList.class.getDeclaredField("elementData");// java.lang.reflect
        field.setAccessible(true);

        strings.trimToSize(); //让元素的数量等于容量

        System.out.println(((Object[]) field.get(strings)).length);
//        ensure 确保\ [ɪn'ʃɔː\;\ -'ʃʊə\;\ en-]
/*
        int n = 10000000;
        ArrayList<Integer> list = new ArrayList<>(n);
//        list.ensureCapacity(n);  //初始一个比较大的容量
        int capacity = ((Object[]) field.get(list)).length;
        System.out.println("capacity: " + capacity);
        long begin = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        System.out.println(System.currentTimeMillis() - begin);*/
    }
}
