package cn.edu.tsinghua.javase.oop;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 14:15 23 Sep 2017
 */

// class = fields + methods
public class Human {

    // fields
    String name;
    int age;
    char gender;
    double height;
    double weight;
    boolean married;

//    cn.edu.tsinghua.javase.oop.Human() { // default constructor
//        married = true;
//    }

    // Command + N | Alt + Insert

    public Human(String name) {
        this.name = name;
    }



    public Human(String name, int age, char gender, double height, double weight, boolean married) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.married = married;
    }

    // methods
    String study(String book) { // void adj.\ 空的；无效的；无人的
        System.out.println(name + " read " + book);
        return "homework...";
    }

    void work(int hours, String device) {
        System.out.println(name + " work " + hours + " hours, with " + device);
    }

    int walk() {
        // ...
        return 100;
    }

    void eat(String food) {
        System.out.println("eat " + food);
    }

    public static void main(String[] args) { // Command + P | Ctrl + P (Parameter)
        Human tom = new Human("Tom", 18, 'M', 1.7, 60, false); // object instance
        // .
        System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(tom.gender);
        System.out.println(tom.height);
        System.out.println(tom.married);

        System.out.println(tom.study("Java SE"));
        tom.work(8, "computer");

        Human jerry = new Human("Jerry");

    }
}
