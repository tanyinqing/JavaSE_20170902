package cn.edu.tsinghua.javase.multithreading;

public class Synchronization {
    public static void main(String[] args) {
        Output output = new Output();
        Library library = new Library(output);
        University university = new University(output);

        library.start();
        university.start();
    }
}

class Output {
    public synchronized void print(String s) {
        System.out.println(s);
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scan(String s) {
        synchronized (s) {
            try {
                s.wait(1000*5);
                System.out.println("scan: " + s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Library extends Thread {

    private Output output;

    public Library(Output output) {
        this.output = output;
    }

    @Override
    public void run() {
        output.print("library print...");
//        output.scan("library print...");
    }
}

class University extends Thread {
    private Output output;

    public University(Output output) {
        this.output = output;
    }

    @Override
    public void run() {
        output.print("University print...");
//        output.scan("University print...");
    }
}
