package com.jl.stream_.outputstream_;

import java.io.Serializable;

public class Dog implements Serializable {
    //    序列化的版本号，可以提高兼容性
    private static final long serialVersionUID = 1L;
    //    static修饰符
    private static String nation;
    private String name;
    private int age;
    //    transient修饰符
    private transient String color;

    private Master master = new Master();


    public Dog(String name, int age, String nation, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", age=" + age + ", color='" + color + '\'' + ",nation='" + nation + '\'' + '}';
    }
}