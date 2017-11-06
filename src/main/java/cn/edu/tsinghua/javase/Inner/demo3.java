package cn.edu.tsinghua.javase.Inner;

public class demo3 {
    public static void main(String[] args) {
        out3 out = new out3();
        out.print(3);
    }
}
class out3{
    private int age=17;
    public void print(final int x){
        class In{
            private void inPrint(){
                System.out.println(age);
                System.out.println(x);
            }
        }
        new In().inPrint();
    }
}