package cn.edu.tsinghua.javase.oop;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 13:44 24 Sep 2017
 */
public class Asian extends Human {

    public Asian(String name) {
        super(name);
    }

    // Ctrl + O

    void eat(String s) {
        System.out.println("cn.edu.tsinghua.javase.oop.Asian eat...");
        super.eat(s); // ?
    }

    public static void main(String[] args) {
        Asian asian = new Asian("");
        asian.eat("");
    }
}
