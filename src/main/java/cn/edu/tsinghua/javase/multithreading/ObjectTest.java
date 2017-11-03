package cn.edu.tsinghua.javase.multithreading;

public class ObjectTest {
    public static void main(String[] args) throws InterruptedException {
       /* Object o=new Object();
        System.out.println(o);
       // o.wait();//等待
        o.notify();//通知
        o.notifyAll();//通知所有的线程
        String s="hello";
        try {
            s.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.notify();
        s.notifyAll();*/
       Object o=new Object();
        Object lock=new Object();
//        synchronized (o){
//            o.wait();
//        }

synchronized (o){
    o.notifyAll();
    System.out.println("test");
    // o.notify();
    o.wait();
}


    }
}
