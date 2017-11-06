package cn.edu.tsinghua.javase.Inner;

public class Demo4 {
    public static void main(String[] args) {
//        father child=new Child();
//        child.study();
        new father() {
            @Override
            public void study() {
                System.out.println("study");
            }
        }.study();
        new Super(){

            @Override
            public void method() {
                System.out.println("methods");
            }
        }.method();
    }
}
interface Super{
    void method();
}
abstract class father{
    public abstract void study();
}
/*
class Child extends father{

    @Override
    public void study() {
        System.out.println("study");
    }
}*/
