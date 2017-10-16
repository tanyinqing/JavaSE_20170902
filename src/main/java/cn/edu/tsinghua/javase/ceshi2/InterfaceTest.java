package cn.edu.tsinghua.javase.ceshi2;
/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 14:10 14 Oct 2017
 */
public interface InterfaceTest {

    int ZERO = 0;

    void method();

}

class InterfaceTestImpl implements InterfaceTest {

    @Override
    public void method() {

    }
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C {
    void c();
}

interface D {
    void d();
}


class AbcdImpl implements A, B, C, D {
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }
}

interface E extends A, B, C, D {
    void e();
}

class EImpl implements E {
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }

    @Override
    public void e() {

    }
}