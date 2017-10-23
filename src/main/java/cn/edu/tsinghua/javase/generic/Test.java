package cn.edu.tsinghua.javase.generic;

import java.io.Serializable;

public class Test<T extends Serializable>{
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
    public T test(T x){
        return x;
    }
public static void main(String[] args) {
 Test<A> ta=new Test<>();
    System.out.println(new A());

}
}
class A implements Serializable {


}
class B {

}