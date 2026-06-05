package com.jl.generic;

import java.util.ArrayList;

public class Generic01 {
	public static void main(String[] args) {
		ArrayList<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("黄", 10));
		list.add(new Dog("黑", 8));
		list.add(new Dog("白", 4));
//		list.add(new Cat("白", 4));

//		假如加入一只猫，会导致转型出异常

//      Exception in thread "main" java.lang.ClassCastException:
//      com.jl.generic.Cat cannot be cast to com.jl.generic.Dog
		for (Object o : list) {
			Dog dog = (Dog) o;
			System.out.println(dog.getName() + "+" + dog.getAge());
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