package cn.edu.tsinghua.javase.multithreading;

public class MT2 implements Runnable{
    public static void main(String[] args) {
        MT2 mt2 = new MT2();
        Thread thread = new Thread(mt2);
        thread.start();
        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
