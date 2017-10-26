package cn.edu.tsinghua.javase.io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileTest {
//    psvm 弹出主方法  sout 输出的快捷键  iter 增强for循环  ctrl+shift+上下箭头 上下移动行
public static void main(String[] args) throws IOException, InterruptedException {

//        File file = new File(".idea");

//        file.createNewFile();
//
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());
//
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());

//        file.delete();

//        file.deleteOnExit();

//        Thread.sleep(1000 * 10);

//        System.out.println(file.getAbsoluteFile().toString());
//        System.out.println(file.getAbsolutePath());
//
//        System.out.println(file.getName());
//        System.out.println(file.getParent());
//        System.out.println(file.getParentFile());
//
//        System.out.println(file.getTotalSpace());
//        System.out.println(file.getUsableSpace());
//
//
//        System.out.println(file.isAbsolute());
//        System.out.println(file.isHidden());
//
//        System.out.println(new Date(file.lastModified()));
//
//        System.out.println(file.length());
//
//        for (File f : file.listFiles()) {
//            System.out.println(f);
//        }
//
//        for (File file1 : file.listRoots()) {
//            System.out.println(file1);
//        }

    //////////


    File file = new File("test.jpg");
//        file.delete();
//        System.out.println(file.mkdir()); // make directory
//        System.out.println(file.mkdirs());

//        file.setLastModified(-100000000000L);

    System.out.println(new Date(file.lastModified()));
}
}
