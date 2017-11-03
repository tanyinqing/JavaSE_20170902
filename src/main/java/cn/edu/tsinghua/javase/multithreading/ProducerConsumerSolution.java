package cn.edu.tsinghua.javase.multithreading;


import java.util.Vector;

// http://www.infoq.com/cn/articles/producers-and-consumers-mode
public class ProducerConsumerSolution {
    public static void main(String args[]) {
        Vector<Integer> sharedQueue = new Vector<>();
        int size = 10;
        Thread producer = new Thread(new Producer(sharedQueue, size), "Producer");
        Thread consumer = new Thread(new Consumer(sharedQueue), "Consumer");
        producer.start();
        consumer.start();
    }
}

class Producer implements Runnable {
    private final Vector<Integer> sharedQueue;
    private final int SIZE;

    Producer(Vector<Integer> sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.SIZE = size;
    }

    @Override
    public void run() {
        for (int i = 0;i<30; i++) {
            try {
                produce(i);
                System.out.println("Produced: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private void produce(int i) throws InterruptedException {
        while (sharedQueue.size() == SIZE) {
            synchronized (sharedQueue) {
                System.out.println("Queue is full " + Thread.currentThread().getName()
                        + " is waiting , size: " + sharedQueue.size());
                sharedQueue.wait();
            }
        }

        synchronized (sharedQueue) {
            sharedQueue.add(i);
            sharedQueue.notifyAll();
        }
    }
}

class Consumer implements Runnable {
    private final Vector sharedQueue;

    Consumer(Vector sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumed: " + consume());
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int consume() throws InterruptedException {
        while (sharedQueue.isEmpty()) {
            synchronized (sharedQueue) {
                System.out.println("Queue is empty " + Thread.currentThread().getName()
                        + " is waiting, size: " + sharedQueue.size());

                sharedQueue.wait();
            }
        }

        synchronized (sharedQueue) {
            sharedQueue.notifyAll();
            return (Integer) sharedQueue.remove(0);
        }
    }
}