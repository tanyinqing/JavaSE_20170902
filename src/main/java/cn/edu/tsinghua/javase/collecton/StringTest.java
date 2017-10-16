package cn.edu.tsinghua.javase.collecton;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 11:25 15 Oct 2017
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "hello"; // 直接量
        System.out.println(s);

        byte[] bytes = new byte[10];
//        String s1 = new String(bytes, 1); // deprecated

        String s2 = new String("hello");
        String s3 = "hello";

        System.out.println(s3.charAt(4));

        System.out.println(s3.concat(" String"));

        System.out.println(s3.substring(2));
        System.out.println(s3.substring(2, 4));

        System.out.println(s3.contains("hell")); // Ctrl + J

        System.out.println(s3.endsWith("lo"));

        System.out.println(s3.toLowerCase().equals("Hello".toLowerCase()));
        System.out.println(s3.equalsIgnoreCase("Hello"));


        System.out.println(s3.isEmpty());

        System.out.println(s3.indexOf("l"));
        System.out.println(s3.lastIndexOf('l'));

        System.out.println(s3.length());

        for (String arg : args) {
            System.out.println(arg);
        }

        System.out.println(s3.matches("e")); // regexp Regular Expression JavaScript

        System.out.println(s3.replace('l', 'a'));
        System.out.println(s3.replaceAll("l", "a"));
        System.out.println(s3.replaceFirst("l", "a"));

        for (String s1 : s3.split("e")) { // 分裂\ [splɪt]
            System.out.println(s1);
        }

        for (char c : s.toCharArray()) {
            System.out.println(c);
        }

        System.out.println("    he ll o hi   ".trim()); // 修剪\ [trɪm]

        System.out.println(String.valueOf(123));

        String s1 = "123";
        int j=Integer.parseInt(s1);
        System.out.println(j+"tan");

        String s4 = "hi";
        String s5 = "hi";
        String s6 = new String("hi");

        System.out.println(s4 == s5); // true
        System.out.println(s4 == s6); // false
//        = 比较的是地址是否相等 也就是不是一个对象
    }
}