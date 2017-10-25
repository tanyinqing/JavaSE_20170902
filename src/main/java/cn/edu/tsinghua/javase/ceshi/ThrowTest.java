package cn.edu.tsinghua.javase.ceshi;

import cn.edu.tsinghua.javase.exception.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ThrowTest {
   public  void method() throws FileNotFoundException{
      // throw new FileNotFoundException(); //主动抛出异常
   }
   public void test(){
       try {
           method();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
   }

//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
public static void main(String[] args) {
    ThrowTest throwTest=new ThrowTest();
    throwTest.test();

    List<Integer> list=new ArrayList<>();
    list.add(1);
    System.out.println(list.get(1));
}
}
class MyException extends Exception{

}