package com.jl.homework342.hw03;

//编写老师类
public class Teacher {
	//1. 要求要有属性名name 年龄age 职称post 基本工资salary
	private String name;
	private int age;
	private String post;
	private double salary;

	public Teacher(String name, int age, String post, double salary) {
		this.name = name;
		this.age = age;
		this.post = post;
		this.salary = salary;
	}

	//2. 编写业务方法 introduce 实现输出一个教师的信息
	public String introduce() {
		return "教师信息为: "
				+ "姓名: " + getName() + " 年龄: " + getAge() + " 职位: " + getPost() + " 工资: " + getSalary();
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

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

//3. 编写教师类的三个子类 教授类 副教授类 讲师类
class Professor extends Teacher {
	public Professor(String name, int age, String post, double salary) {
		super(name, age, post, salary);
	}

	// 在三个子类的introduce中都重写introduce方法
	@Override
	public String introduce() {
		return "教师信息为: "
				+ "姓名: " + getName()
				+ " 年龄: " + getAge()
				+ " 职位: " + getPost()
				+ " 工资: " + getSalary() * 1.3;// 工资级别分别为教授为1.3,副教授为1.2 讲师类1.1

	}
}

class SecondProfessor extends Teacher {
	public SecondProfessor(String name, int age, String post, double salary) {
		super(name, age, post, salary);
	}

	@Override
	public String introduce() {
		return "教师信息为: "
				+ "姓名: " + getName()
				+ " 年龄: " + getAge()
				+ " 职位: " + getPost()
				+ " 工资: " + getSalary() * 1.2;// 工资级别分别为教授为1.3,副教授为1.2 讲师类1.1

	}
}

class NormalTeacher extends Teacher {
	public NormalTeacher(String name, int age, String post, double salary) {
		super(name, age, post, salary);
	}

	@Override
	public String introduce() {
		return "教师信息为: "
				+ "姓名: " + getName()
				+ " 年龄: " + getAge()
				+ " 职位: " + getPost()
				+ " 工资: " + getSalary() * 1.1;// 工资级别分别为教授为1.3,副教授为1.2 讲师类1.1

	}
}
