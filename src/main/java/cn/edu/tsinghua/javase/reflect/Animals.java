package cn.edu.tsinghua.javase.reflect;

public class Animals {
    public int age; // It's public
    private double weight;

    public Animals() {
    }

    public Animals(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int sleep(int hours) {
        return hours;
    }

    public void eat(String food) {
        System.out.println("eating " + food);
    }

    // This's a private method!
    private void killHuman() {
        System.out.println("killed a poor guy...");
    }

    // getters and setters
}
