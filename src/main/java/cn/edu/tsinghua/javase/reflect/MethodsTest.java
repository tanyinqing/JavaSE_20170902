package cn.edu.tsinghua.javase.reflect;

import java.lang.reflect.Method;

public class MethodsTest {
    public static void main(String[] args) {
        Human human = new Human();
        Method[] methods = human.getClass().getMethods();
            System.out.println("--- getMethods公有的方法包括父类包括父类的父类例如object ---");
        for (Method method : methods) {
            System.out.println(method);
        }
        Method[] declaredMethods = human.getClass().getDeclaredMethods();
        System.out.println("--- getDeclaredMethods 所有的方法 但仅限于本类---");
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }
}
