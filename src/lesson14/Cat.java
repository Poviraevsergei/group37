package lesson14;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private transient String password = "qwerty";

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
