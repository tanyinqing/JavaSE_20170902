package cn.edu.tsinghua.javase.basic;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 11:32 23 Sep 2017
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 5) {
//                break;
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }


//        do {
//            System.out.println(i);
//            i++;
//        } while (i > 10);
    }
}
