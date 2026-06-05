package com.jl.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {

	public static void main(String[] args) {

		List arr = new ArrayList();
		arr.add(new Dog("大黄", 3));
		arr.add(new Dog("大红", 1));
		arr.add(new Dog("大绿", 5));

		Iterator iterator = arr.iterator();

		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);

		}

		for (Object o : arr) {
			System.out.println(o);
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

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
