package cn.edu.tsinghua.javase.oop;
/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 10:58 14 Oct 2017
 */
public abstract class Shape {

    // 面积
    public abstract double getArea();

    // 周长
    public abstract double getPerimeter();

}

class Square extends Shape {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
}

class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}

class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (!((a + b) > c && (b + c) > a && (c + a) > b)) {
            System.out.println("Error.");
            System.exit(0);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = a + b + c / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // 求三角形的面积
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}

class ShapeTest {

    public static void main(String[] args) {
        Square square = new Square(1.2);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Triangle triangle = new Triangle(1, 4, 5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}