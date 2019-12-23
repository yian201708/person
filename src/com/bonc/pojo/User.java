package com.bonc.pojo;

public class User {
    private Integer age;
    private String address;
    private int salary;
    private String name;
    private String hobby;
    private String hair;
    private boolean hasFriend;
    private Integer height;
    private String loverName;
    private Integer weight;
    private String color;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                ", hair='" + hair + '\'' +
                ", hasFriend=" + hasFriend +
                ", height=" + height +
                ", loverName='" + loverName + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
