package cn.edu.tsinghua.javase.multithreading;

public class Synchronization {
    public static void main(String[] args) {
        Food water = new Food("water");
        //        Food fish = new Food("fish");
        //        Food bone = new Food("bone");

        Cat cat = new Cat("kitty", water);
        Dog dog = new Dog("tiger", water);

        cat.start();
        dog.start();
    }
}

class Food {
    private String name;

    Food(String name) {
        this.name = name;
    }

    synchronized void eat1() {
        System.out.println(Thread.currentThread().getName() + " is eating " + name);
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void eat2() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " is eating " + name);
            try {
                Thread.sleep(1000 * 5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized static void eat3() {
        System.out.println(Thread.currentThread().getName() + " is eating...");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Cat extends Thread {
    private Food food;

    Cat(String name, Food food) {
        super(name);
        this.food = food;
    }

    @Override
    public void run() {
        food.eat1();
//        food.eat2();
//        food.eat3();
    }
}

class Dog extends Thread {
    private Food food;

    Dog(String name, Food food) {
        super(name);
        this.food = food;
    }

    @Override
    public void run() {
        food.eat1();
//        food.eat2();
//        food.eat3();
    }
}
