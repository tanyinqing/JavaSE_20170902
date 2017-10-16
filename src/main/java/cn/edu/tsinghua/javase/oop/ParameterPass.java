package cn.edu.tsinghua.javase.oop;
/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 15:40 14 Oct 2017
 */
public class ParameterPass {

    private int i;

    public ParameterPass(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private static void method(ParameterPass parameterPass) {
        System.out.println(parameterPass.getI()); // 0
        parameterPass.setI(1);
        System.out.println(parameterPass.getI()); // 1
    }

    public static void main(String[] args) {
        //这儿传递的是基本数据类型
        ParameterPass parameterPass = new ParameterPass(0);
        System.out.println(parameterPass.getI()); // 0
        //这儿传递的是引用数据类型
        method(parameterPass);
        System.out.println(parameterPass.getI()); // ? 0
    }
}