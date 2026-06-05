package com.jl.homework342.hm13;

//创建一个 Student 类，包含属性：姓名（name）、性别（sex）、年龄（age）、
// 学号（stu_id）。要求合理封装，并通过构造器在创建对象时初始化这四个属性。
public class Student extends Person {

	private int stu_id;

	//学生类需要有学习的方法（study），在方法中写上“我承诺，我会好好学习。”
	public void study() {
		System.out.println("我承诺,我会好好学习.");
	}

	public Student(String name, char sex, int age, int stu_id) {
		super(name, sex, age);
		this.stu_id = stu_id;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	//学生和教师都有玩的方法（play），学生玩的是足球，返回“xx爱玩足球”和“xx爱玩象棋”

	@Override
	public void play() {
		System.out.println(getName() + "爱踢足球");
	}

	@Override
	public void action(Person p) {
		study();
	}

	public void showInfo() {
		System.out.println("学生的信息:");
		System.out.print(super.basicInfo());
		System.out.println("\n学号:" + getStu_id());
		study();
		play();
	}
}
