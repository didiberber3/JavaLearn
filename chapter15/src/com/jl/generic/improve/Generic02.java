package com.jl.generic.improve;

import java.util.ArrayList;

public class Generic02 {
	public static void main(String[] args) {
		ArrayList<Dog> list = new ArrayList<Dog>();
//		添加了泛型，则指定添加到集合中的类型是Dog类型
		list.add(new Dog("黄", 10));
		list.add(new Dog("黑", 8));
		list.add(new Dog("白", 4));

//		如果编译器发现添加的类型不满足要求，就会报错
//		list.add(new Cat("123", 123));
//		在遍历的时候，可以直接取出Dog类型
		System.out.println("=====使用泛型的方法遍历=====");
		for (Dog o : list) {
			System.out.println(o.getName() + "-" + o.getAge());
		}


	}
}

class Dog {
	private String name;
	private int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
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
}

class Cat {
	private String name;
	private int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
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
}