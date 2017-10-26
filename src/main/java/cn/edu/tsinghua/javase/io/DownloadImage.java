package cn.edu.tsinghua.javase.io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {
    private static final String IMAGE_URL = "http://img.jandan.net/news/2017/09/cf114fae2a31b13bac5a13c5bce745df.jpg";
    private static int counter;
    public static void download(String imageUrl){
        try {
            URL url = new URL(imageUrl);
//            System.out.println(url.getFile());
            try (
                    BufferedInputStream inputStream = new BufferedInputStream(url.openStream());
                    BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("D:/tan/tan"+ (++counter) + ".jpg"))
            ) {
//                int i;
//                while ((i = inputStream.read()) != -1) {
//                    outputStream.write(i);
//                }
                // 8bit = 1byte  1个字节等于8个位
                int i = inputStream.read();//这个向当于每次读出一个字节 也就是8个0或1的组合
                while (i != -1) {
                    outputStream.write(i); //字节逐个输入
                    i = inputStream.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
//        java.net.URL
        download(IMAGE_URL);
    }
}
