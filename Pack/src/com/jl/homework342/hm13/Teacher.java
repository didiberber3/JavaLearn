package com.jl.homework342.hm13;

//创建一个 Teacher 类，包含属性：姓名（name）、性别（sex）、年龄（age）、
// 工龄（work_age）。要求合理封装，并通过构造器在创建对象时初始化这四个属性。
public class Teacher extends Person {

	private int work_age;

	//教师类需要有教学的方法（teach），在方法中写上“我承诺，我会认真教学。”
	public void teach() {
		System.out.println("我承诺,我会认真教学");
	}

	public Teacher(String name, char sex, int age, int work_age) {
		super(name, sex, age);
		this.work_age = work_age;
	}

	public int getWork_age() {
		return work_age;
	}

	public void setWork_age(int work_age) {
		this.work_age = work_age;
	}
//学生和教师都有玩的方法（play），老师玩的是象棋。此方法返回字符串，“xx爱玩象棋”

	@Override
	public void play() {
		System.out.println(getName() + "爱玩象棋");
	}

	@Override
	public void action(Person p) {
		teach();
	}

	public void showInfo() {
		System.out.println("学生的信息:");
		System.out.print(super.basicInfo());
		System.out.println("\n学号:" + getWork_age());
		teach();
		play();
	}
}
