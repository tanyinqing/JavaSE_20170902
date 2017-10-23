package cn.edu.tsinghua.javase.generic;

import java.io.Serializable;

public interface GenericInterface<T extends Serializable,E,S,U> {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行

    T method(T t);
}
//实现一个泛型接口的话 类也要是泛型
/*
class GenericImpl<T> implements GenericInterface<T>{

    @Override
    public T method(T t) {
        return null;
    }
}*/
// 泛型的参数是有界类型  实现类要一致
class GenericImpl<T extends Serializable,E,S,U> implements GenericInterface<T,E,S,U>{

    @Override
    public T method(T t) {
        return null;
    }
}