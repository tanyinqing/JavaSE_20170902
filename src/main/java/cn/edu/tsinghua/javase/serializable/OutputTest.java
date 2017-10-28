package cn.edu.tsinghua.javase.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputTest {
    public static void main(String[] args) {
        User user = new User(1, "username", 1.8, true);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user.data"))) {
            objectOutputStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
