package model;

import java.io.Serializable;

public class Person implements Serializable {
    private  String name;
    private String identity;

    public Person(String name, String identity) {
        this.name = name;
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
