package com.jl.generic;

import java.util.*;


public class GenericExercise {
	public static void main(String[] args) {

		System.out.println("========HashSet & Iterator========");

		HashSet<Student> list = new HashSet<Student>();

		list.add(new Student("student1", 18));
		list.add(new Student("student2", 15));
		list.add(new Student("student3", 74));


		Iterator<Student> itr = list.iterator();
		while (itr.hasNext()) {
			Student next = itr.next();
			System.out.println(next);
		}

		System.out.println("========HashMap & Map.Entry & Iterator========");


		HashMap<String, Student> map = new HashMap<>();

		map.put("student1", new Student("student1", 18));
		map.put("student2", new Student("student2", 15));
		map.put("student3", new Student("student3", 74));

//		迭代器 EntrySet,取出类型为Map.Entry类型的，其有两个参数为String和Student K，V
		Set<Map.Entry<String, Student>> entries = map.entrySet();
		Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Student> next = iterator.next();
			System.out.println(next);
		}


	}
}

class Student<T> {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}