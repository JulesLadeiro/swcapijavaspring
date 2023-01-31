package com.swc.swcapi;

public class Character {
    private int id;
    private String name;
    private String helloString;

    public Character(int id, String name) {
        this.id = id;
        this.name = name;
        this.helloString = "Hello " + name + "!";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHelloString() {
        return helloString;
    }
}
