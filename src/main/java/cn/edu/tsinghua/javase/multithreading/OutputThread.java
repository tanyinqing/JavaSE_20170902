package cn.edu.tsinghua.javase.multithreading;

public class OutputThread implements Runnable {
    private int num;
    private Object lock;

    public OutputThread(int num, Object lock) {
        this.num = num;
        this.lock = lock;
    }

    // 1 2交替执行
    @Override
    public void run() {
        long start=System.currentTimeMillis();
        try {
            while (System.currentTimeMillis()-start<1000) {
                synchronized (lock) {//进来的线程会获得同步锁
                    System.out.println(num);
                    lock.notify();//唤醒其他线程
                    lock.wait();//阻塞状态
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Object lock=new Object();
        Thread thread1=new Thread(new OutputThread(1,lock));
        Thread thread2=new Thread(new OutputThread(2,lock));
        thread1.start();
        thread2.start();
    }
   /* private int num;
    private final Object lock;

    private OutputThread(int num, Object lock) {
        this.num = num;
        this.lock = lock;
    }

    public void run() {
        try {
            while (true) {
                synchronized (lock) {
                    System.out.println(num);
                    lock.notify();
                    lock.wait();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final Object lock = new Object();

        Thread thread1 = new Thread(new OutputThread(1, lock));
        Thread thread2 = new Thread(new OutputThread(2, lock));

        thread1.start();
        thread2.start();
    }*/
}
