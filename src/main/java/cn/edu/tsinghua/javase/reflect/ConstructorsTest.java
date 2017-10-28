package cn.edu.tsinghua.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class ConstructorsTest {
    public static void main(String[] args) {
        Human human = new Human();
        Constructor[] constructors = human.getClass().getConstructors();
        System.out.println("--- getConstructors 公有的构造方法---");
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
//            当前构造方法的参数
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println("\t" + parameter);
            }
//            用构造器new一个实例
            Human human1 = null;
            try {
                human1 = (Human) constructor.newInstance(20, 60, "Tom", false);
                System.out.println(human1.getAge());
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        Constructor[] declaredConstructors = human.getClass().getDeclaredConstructors();
        System.out.println("--- getDeclaredConstructors ---");
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
            for (Parameter parameter : declaredConstructor.getParameters()) {
                System.out.println("\t" + parameter);
            }
        }
    }
}
