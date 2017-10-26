package cn.edu.tsinghua.javase.io;

import cn.edu.tsinghua.javase.io.DownloadImage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Homework {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
private static final String HTML_URL = "http://jandan.net/page/";
public static void main(String[] args) throws MalformedURLException {
//        URL.openStream()
//        BufferedReader.readLine()

    for (int i = 1; i < 100; i++) {

        URL url = new URL(HTML_URL + i);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) { // InputStreamReader: inputStream => Reader
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("<div class=\"thumbs_b\">")) {
                    String imageUrl = "http:" + line.substring(line.indexOf("//img"), line.indexOf("!custom"));
                    DownloadImage.download(imageUrl);
                    System.out.println(imageUrl);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
}
