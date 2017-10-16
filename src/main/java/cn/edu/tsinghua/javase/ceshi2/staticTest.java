package cn.edu.tsinghua.javase.ceshi2;

public class staticTest {
    private static int i;
    private String name;
    private static final double pi=0;
    public static void method(){

    }

    static {
        System.out.println("tam");
    }
    public static void main(String[] args) {
        staticTest mstaticTest=new staticTest();
        mstaticTest.name="Tom";
        mstaticTest.i=1;

        System.out.println(mstaticTest.name);
        System.out.println(mstaticTest.i);

        staticTest mstaticTest2=new staticTest();
        mstaticTest2.name="Tom";
//        mstaticTest.i=1;

        System.out.println(mstaticTest2.name);
        System.out.println(mstaticTest2.i);
    }
}
