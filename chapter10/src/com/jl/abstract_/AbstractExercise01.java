package com.jl.abstract_;

public class AbstractExercise01 {
	public static void main(String[] args) {

		Manager djj = new Manager("大将军", 2, 3000);
		djj.setBonus(500);
		djj.work();
		CommonEmployee xs = new CommonEmployee("下士", 3, 2000);
		xs.work();
	}
}

//编写一个Employee类，声明为抽象类，
abstract class Employee {

	// 包含如下三个属性：name，id，salary。
	private String name;
	private int id;
	private double sal;

// 提供必要的构造器

	public Employee(String name, int id, double sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	//和抽象方法：work()。
	public abstract void work();
}

// 对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
// 请使用继承的思想，设计CommonEmployee类和Manager类，
class Manager extends Employee {
	private double bonus;

	// 要求类中提供必要的方法进行属性访问,实现work()，
	public Manager(String name, int id, double sal) {
		super(name, id, sal);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("经理 " + getName() + " 工作中...");
	}
}

class CommonEmployee extends Employee {
	private double bonus;

	// 要求类中提供必要的方法进行属性访问,实现work()，
	public CommonEmployee(String name, int id, double sal) {
		super(name, id, sal);
	}

	@Override
	public void work() {
		System.out.println("普通员工 " + getName() + " 工作中...");
	}
}
// 提示 "经理/普通员工 名字 工作中...."