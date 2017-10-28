package cn.edu.tsinghua.javase.reflect;

// sub class Human
public final class Human extends Animals {
    public String name; // It's public!
    private boolean married;

    Human() { // It's package-private!
    }

    public Human(int age, double weight, String name, boolean married) {
        super(age, weight);
        this.name = name;
        this.married = married;
    }

    @Override//这个是重写  super是重载
    public void eat(String food) {
        System.out.println(name + " is now eating " + food);
    }

    public void study(String course,int age) {
        System.out.println(name + " is now studying " + course);
    }

    // This's a private method!
    private void killAnimals(String animal) {
        System.out.println(name + " is now killing " + animal);
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getters and setters
}