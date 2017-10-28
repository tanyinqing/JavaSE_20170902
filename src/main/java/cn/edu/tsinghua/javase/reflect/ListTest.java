package cn.edu.tsinghua.javase.reflect;

import java.io.File;

public class ListTest {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
public static void main(String[] args) {
    File file=new File("D:/");
    String []files=file.list();
    System.out.println(files.length);
    for (String s : files) {
        System.out.println(s);
    }
}
}
