package com.jl.set_;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings("all")
public class HashSetExercise {
	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add(new Employee("john", 10));
		hs.add(new Employee("jack", 13));
		hs.add(new Employee("rose", 14));
		hs.add(new Employee("john", 10));

		System.out.println(hs);


	}
}

class Employee {
	private String name;
	private int age;

	public Employee(String name, int age) {
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
		return "Employee{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

//	以下的重写equals和hashCode的含义为：
//	如果相等则不再添加,如果不想等,则以链表的形式添加

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Employee)) return false;
		Employee employee = (Employee) o;
		return getAge() == employee.getAge() && Objects.equals(getName(), employee.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getAge());
	}
}