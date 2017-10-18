package cn.edu.tsinghua.javase.collecton;


/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:37 17 Oct 2017
 */
public class OverrideTest extends Object {


    public static void main(String[] args) {
        OverrideTest overrideTest = new OverrideTest();
        System.out.println(overrideTest.toString());
        // toString也可以隐式调用 这是object的方法  但是子类可以重写 利用了多态
        Object o=new Object();
        o.toString();
    }

    @Override
    public String toString() {
        return "zhangsan";
    }

    // Object hashCode() equals() toString()
}