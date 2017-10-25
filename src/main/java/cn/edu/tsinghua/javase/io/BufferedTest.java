package cn.edu.tsinghua.javase.io;

import java.io.*;

public class BufferedTest {
    //    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
    public static void main(String[] args) {
        // 缓冲流比较快
        try (
//                InputStream inputStream = new FileInputStream("/Users/mingfei/Desktop/1025_JavaSE-RandomAccessFile.mov");
//                OutputStream outputStream = new FileOutputStream("test.mov")
                BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("/Users/mingfei/Desktop/1025_JavaSE-RandomAccessFile.mov"));
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("test.mov"))
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
