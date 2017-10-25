package cn.edu.tsinghua.javase.io;

import java.io.*;

public class InputStreamOutputStreamTest extends FileInputStream{
    private static final String file = "src/main/java/cn/edu/tsinghua/javase/ceshi/InputStreamOutputStreamTest.java";

    public InputStreamOutputStreamTest(String name) throws FileNotFoundException {
        super(name);
    }

    //    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
    public static void main(String[] args) throws IOException {
        //7.0新特性 保证资源一定会关闭 和资源相关的放在小括号中 自动关闭
        try (
                InputStreamOutputStreamTest inputStream = new InputStreamOutputStreamTest(file);
                OutputStream outputStream = new FileOutputStream("test");
        ) {

            int i;//一边读一边写
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
//重写父类 验证资源关闭了
    @Override
    public void close() throws IOException {
        super.close();
        System.out.println("close");
    }
}

