package cn.edu.tsinghua.javase.collecton;

import java.util.Hashtable;

public class HashtableDemo {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
public static void main(String[] args) {

    Hashtable<Integer, String> hashtable = new Hashtable<>();
    hashtable.put(1, "hi");
    hashtable.put(1, "hi");
//        hashtable.put(null, "hi");
//        hashtable.put(1, null);

    System.out.println(hashtable.size());

}
}
