package cn.edu.tsinghua.javase.collecton;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 16:21 15 Oct 2017
 */
public class HashtableTest {
    public static void main(String[] args) {

        Hashtable<String, String> hashtable = new Hashtable<>(); // K-key 键 V-value 值

        hashtable.put("k1", "v1");
        hashtable.put("k2", "v2");
        hashtable.put("k3", "v3");
        hashtable.put("k4", "v4");

        System.out.println(hashtable.get("k3"));

        System.out.println(hashtable.size());

        System.out.println(hashtable.remove("k3"));

//        hashtable.clear();
        System.out.println(hashtable.size());

        for (String s : hashtable.keySet()) {
            System.out.println(s + "->" + hashtable.get(s));
        }

        for (String s : hashtable.values()) {
            System.out.println(s);
        }

        for (Map.Entry<String, String> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println(hashtable.toString());

        System.out.println(hashtable.containsKey("k3"));

        System.out.println(hashtable.containsValue("v3"));
        System.out.println(hashtable.contains("v3"));

        System.out.println(hashtable.size());
        hashtable.put("k1", "v11");
        System.out.println(hashtable.size()); // ?

        for (String s : hashtable.keySet()) {
            System.out.println(s + "->"+ hashtable.get(s));
        }

        Hashtable<String, Integer> hashtable1 = new Hashtable<>();
    }
}