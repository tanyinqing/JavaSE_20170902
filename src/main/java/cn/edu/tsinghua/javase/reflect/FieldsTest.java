package cn.edu.tsinghua.javase.reflect;

import java.lang.reflect.Field;

public class FieldsTest {
    public static void main(String[] args) {
        Human human = new Human();
        //getFields返回所有公有的变量
        Field[] fields = human.getClass().getFields();
        System.out.println("--- getFields() ---");
        for (Field field : fields) {
            System.out.println(field.getName());
        }
//        返回所有的变量  但仅是当前类
        Field[] declaredFields = human.getClass().getDeclaredFields();
        System.out.println("--- getDeclaredFields() ---");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
    }
}
