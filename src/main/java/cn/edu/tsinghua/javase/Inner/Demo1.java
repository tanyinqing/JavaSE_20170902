package cn.edu.tsinghua.javase.Inner;

public class Demo1 {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
public static void main(String[] args) {
    Out.In in = new Out().new In();
    in.print();
    // 或者采用下种方式访问
                 /*
                 Out out = new Out();
                 Out.In in = out.new In();
                 in.print();
                 */
}

}
class Out {   //内部了适应了默认修饰符  包外无法访问
    private int age = 12;

    //内部类
    class In {
        public void print() {
            System.out.println(age);
        }
    }
}