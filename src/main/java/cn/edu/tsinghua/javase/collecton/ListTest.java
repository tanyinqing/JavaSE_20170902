package cn.edu.tsinghua.javase.collecton;
import java.util.List;
import java.util.Vector;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:16 17 Oct 2017
 */
public class ListTest {
    public static void main(String[] args) {
        // option + command + U
//        List
        Vector<Integer> integers = new Vector<>();
        integers.add(1);
        integers.add(-1);
        integers.add(100);
        integers.add(100);

        for (Integer integer : integers) {
            System.out.println(integer);
        }

        System.out.println(integers.capacity());//返回这个容器的容量
    }
}