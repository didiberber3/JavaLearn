package com.jl.debug;

//debug对象创建的过程,加深对调试的理解

public class DebugExercise01 {
	public static void main(String[] args) {
		//创建对象的流程
		//1. 加载Person类信息
		//2. 初始化 默认初始化 显式初始化 构造器初始化
		//3. 返回对象的地址

		Person person = new Person("cxk", 18);
		System.out.println(person);
	}
}

class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "super.toString()被重写..." + getName() + " " + " " + getAge();
	}
}
