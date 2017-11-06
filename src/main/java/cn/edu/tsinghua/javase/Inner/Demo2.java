package cn.edu.tsinghua.javase.Inner;

public class Demo2 {
    //    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
    public static void main(String[] args) {

      Out1.In1 in=new Out1.In1();
      in.print();
    }

}

 class Out1 {   //内部了适应了默认修饰符  包外无法访问
    private static int age = 12;

    //内部类
    static class In1 {
        public void print() {
            System.out.println(age);
        }
    }
}