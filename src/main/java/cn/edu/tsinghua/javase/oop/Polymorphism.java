package cn.edu.tsinghua.javase.oop;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 13:07 24 Sep 2017
 */
public class Polymorphism { // Command + O

    double add(double x, int y) {
        return x + y;
    }

    int add(int a, double b) {
        return a;
    }

    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        System.out.println(polymorphism.add(1, 2d)); // L f d
    }
}
