package cn.edu.tsinghua.javase.ceshi2;

public class ParameterPasss {
    private String i="tan";

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public static void method(ParameterPasss mParameterPasss){
        System.out.println(mParameterPasss.i);
        mParameterPasss.setI("yin");
        System.out.println(mParameterPasss.i);
    }

    public static void main(String[] args) {
        ParameterPasss mParameterPasss=new ParameterPasss();
        System.out.println(mParameterPasss.i);
        method(mParameterPasss);
        System.out.println(mParameterPasss.i);
    }
}
