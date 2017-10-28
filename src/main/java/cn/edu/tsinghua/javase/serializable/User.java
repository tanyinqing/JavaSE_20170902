package cn.edu.tsinghua.javase.serializable;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String name;
    private double height;
    private transient boolean isMarried;

    public User() {
    }

    public User(Integer id, String name, double height, boolean isMarried) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.isMarried = isMarried;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", isMarried=" + isMarried +
                '}';
    }
}
