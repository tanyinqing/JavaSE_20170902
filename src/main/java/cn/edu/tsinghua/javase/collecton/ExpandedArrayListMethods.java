package cn.edu.tsinghua.javase.collecton;

import java.util.ArrayList;
import java.util.List;

public class ExpandedArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        //比较的是内容 两个列表个数一样 顺序一样才可以
        System.out.println(list1.equals(list2));
        //比较的是内存地址
        System.out.println(list1==list2);
// 返回的是view 视图
        List list3= list1.subList(0,2);
        System.out.println(list3);
        list1.remove(2);
        System.out.println(list1.containsAll(list2));
//    list1.removeIf();
        System.out.println(list1.retainAll(list2));
        System.out.println(list1);

    }

}
