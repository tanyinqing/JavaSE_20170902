package cn.edu.tsinghua.javase.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    //    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
    public static void main(String[] args) {

        try (RandomAccessFile randomAccessFile = new RandomAccessFile("test", "rw");
        ) {//指针逐个移动  写数据
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(i*0.5);
            }//一个Double占8个字节
            randomAccessFile.seek(8);//指针移动到0字节的位置
            System.out.println(randomAccessFile.readDouble());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
