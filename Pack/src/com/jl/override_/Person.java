package com.jl.override_;

public class Person {
	private String name;
	private int age;

	//创建Person无参构造器初始化对象
	public Person() {

	}

	//使用get set方法 读写私有属性
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//创建say方法返回String语句 旨在可以用print直接打印,优化结构
	public String say() {
		return "我是" + this.name + "我的年龄是" + this.age + "岁";
	}

}
