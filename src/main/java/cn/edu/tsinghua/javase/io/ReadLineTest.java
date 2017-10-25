package cn.edu.tsinghua.javase.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineTest {
    //    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
    public static void main(String[] args) {
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/cn/edu/tsinghua/javase/ceshi/ReadLineTest.java"));
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
