package cn.edu.tsinghua.javase.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:37 24 Oct 2017
 */
public class WriterTest {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("test1");
            writer.write("中文");
            writer.flush(); // 刷
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close(); // NPE
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}