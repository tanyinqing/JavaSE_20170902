package cn.edu.tsinghua.javase.oop;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 15:33 24 Sep 2017
 */
public class Calculator {

    public double pi = 3.1415926;

    private int x;
    private int y;

    private boolean b;

//    public Calculator(int x, int y) {
//        this.x = x;
//        if (y == 0) {
//            System.out.println("y can not be zero.");
//            System.exit(0);
//        } else {
//            this.y = y;
//        }
//    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    int divide() {
        m();
        return x / y;
    }

    private void m() {
        System.out.println("...");
    }
}
