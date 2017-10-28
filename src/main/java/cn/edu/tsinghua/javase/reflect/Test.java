package cn.edu.tsinghua.javase.reflect;

import java.lang.reflect.Field;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public class Test {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
public static void main(String[] args) {
    List<String> strings=new ArrayList<>();
    for (int i = 0; i < 10; i++) {
        strings.add("hi");
    }

    strings.add("hello");
    System.out.println(strings.size());
    try {
        //获得所在类的类对象 下面三种方法
        Class mclass=Class.forName("java.util.ArrayList");
        // 这个变量是默认的
        Field field=mclass.getDeclaredField("elementData");
//        Field field=ArrayList.class.getDeclaredField("elementData");
//        Field field=strings.getClass().getDeclaredField("elementData");
        field.setAccessible(true);//改成可以访问的
        int capacity=((Object[])field.get(strings)).length;
        System.out.println(capacity);
    } catch (NoSuchFieldException e) {
        e.printStackTrace();
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
}
}
