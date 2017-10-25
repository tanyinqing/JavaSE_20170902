package cn.edu.tsinghua.javase.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:52 24 Oct 2017
 */
public class InputStreamTest {
    public static void main(String[] args) {

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/main/java/cn/edu/tsinghua/javase/io/InputStreamTest.java");
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

// 中