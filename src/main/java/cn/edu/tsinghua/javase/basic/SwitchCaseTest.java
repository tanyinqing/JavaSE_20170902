package cn.edu.tsinghua.javase.basic;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 11:02 23 Sep 2017
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        String level = "A";

        switch (level) {
            case "A":
                System.out.println("85-90");
                break;
            case "B":
                System.out.println("70-85");
                break;
            case "C":
                System.out.println("60-70");
                break;
            case "D":
                System.out.println("0-60");
                break;
            default:
                System.out.println("ERROR.");
                break;
        }
    }
}
