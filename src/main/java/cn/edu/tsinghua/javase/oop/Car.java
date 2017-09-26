package cn.edu.tsinghua.javase.oop;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 10:31 24 Sep 2017
 */
public class Car extends Vehicle {


    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.brand);
        car.run();
    }
}
