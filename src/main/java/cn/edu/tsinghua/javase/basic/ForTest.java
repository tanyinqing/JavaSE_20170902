package cn.edu.tsinghua.javase.basic;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 11:25 23 Sep 2017
 */
public class ForTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
//                break; //
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 100; i++) {
            if (i == 50) {
                break;
            }
            // Option + Command + T | Ctrl + Alt + T
            System.out.println(i);
        }

//        int[] ints = {-1, 0, 100, 999};
//        for (int i : ints) {
//            System.out.println(i);
//        }
    }
}
