package cn.edu.tsinghua.javase.collecton;

public class ArrayTest {
    public static void main(String[] args) {
        double[]doubles={1,2};
        System.out.println(doubles.length);
        int[] ints;
        boolean[] booleans;
        ints=new int[2];
        booleans=new boolean[100];
        String[] strings=new String[12];
        System.out.println(ints[0]);
        for (int i = 0; i <ints.length ; i++) {
            ints[i]=i;
        }
        for (int i = 0; i <ints.length ; i++) {
            System.out.println(ints[i]);

        }
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
