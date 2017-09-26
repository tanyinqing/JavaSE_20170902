package cn.edu.tsinghua.javase.oop;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 14:52 24 Sep 2017
 */
public class AccessModifierTest { // Command + 7 | Alt + 7

    // public 公有
    // private 私有
    // protected 保护
    // default 缺省 package-private

    private int i;
    protected double d;
    boolean b;
    public String s;

    private void m1() {
        i = 0;
        System.out.println(i);
    }

    protected void m2() {

    }

    void m3() {

    }

    public void m4() {

    }
}
