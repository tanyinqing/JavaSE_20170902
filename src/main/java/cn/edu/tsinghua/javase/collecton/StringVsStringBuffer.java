package cn.edu.tsinghua.javase.collecton;
/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 15:08 15 Oct 2017
 */
public class StringVsStringBuffer {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {

        String s = "";

        StringBuffer stringBuffer = new StringBuffer();

        long start = System.currentTimeMillis(); // 1970.1.1 - current
        for (int i = 0; i < 10000; i++) {
//            s += ALPHABET;
            stringBuffer.append(ALPHABET);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);

        System.out.println(stringBuffer.length()); // ?
    }
}