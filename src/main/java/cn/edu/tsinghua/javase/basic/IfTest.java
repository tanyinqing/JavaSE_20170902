package cn.edu.tsinghua.javase.basic;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 10:36 23 Sep 2017
 */
public class IfTest {
    public static void main(String[] args) {

        int score = 70;
        score = 50;
        score = 40;
        score = 90;

        if (score > 85) {
            System.out.println("A");
        } else if(score > 70) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        String result = (score >= 60)?"passed.":"failed.";

        System.out.println(result);

        System.out.println("done.");

    }
}
