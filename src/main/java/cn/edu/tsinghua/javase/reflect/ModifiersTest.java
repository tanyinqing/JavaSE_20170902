package cn.edu.tsinghua.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ModifiersTest {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println(Modifier.toString(Human.class.getModifiers()));
        Field name = Human.class.getField("name");
        System.out.println(Modifier.toString(name.getModifiers()));
        Method study = Human.class.getMethod("study", String.class, int.class);
        System.out.println(Modifier.toString(study.getModifiers()));

        Human human = new Human();
        human.setName("Jerry");
//调用反射得到的方法
        study.invoke(human,"Java SE", 2); // invoke 调用\ [ɪn'vəʊk] call
    }
}
