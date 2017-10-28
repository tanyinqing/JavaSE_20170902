package cn.edu.tsinghua.javase.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OutputTest1 {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.data"))) {
            User u = (User) objectInputStream.readObject();
            System.out.println(u);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
