package cn.edu.tsinghua.javase.oop;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 10:47 14 Oct 2017
 */
public abstract class AbstractTest {

    public abstract void method();

    public static void main(String[] args) {
//        AbstractTest abstractTest = new AbstractTest();
    }
}

class SubAbstractTest extends AbstractTest {

    @Override
    public void method() {

    }
}