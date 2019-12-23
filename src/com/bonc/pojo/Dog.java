package com.bonc.pojo;

public class Dog {
    private String name;
    private String owner;
    private String color;
//toString方法
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
