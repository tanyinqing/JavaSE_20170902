package cn.edu.tsinghua.javase.multithreading;

public class MT6 implements Runnable{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MT6());
        thread1.setName("thread 1");
        Thread thread2 = new Thread(new MT6());
        thread2.setName("thread 2");

        thread1.start();
        thread2.start();

        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ": " + Thread.currentThread().getName() + " is running...");
            if (i % 10 == 0) {
                Thread.yield();
            }
        }
    }
}
