package com.jl.homework342.hw04;

//父类:员工类
public class Employee {

	//员工属性:姓名，单日工资，工作天数
	private String name;
	private double salary;
	private int day;

	public Employee() {
	}

	public Employee(String name, double salary, int day) {
		this.name = name;
		this.salary = salary;
		this.day = day;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary = salary * 1;
	}

	public int getDay() {
		return day;
	}

	/**
	 *
	 */
	//1. 员工方法(打印工资)
	public void printInfo() {
		System.out.println("员工 " + this.name + " 的工资为: " + this.salary);
	}

}

//子类:部门经理类、普通员工类
//1. 普遍员工及部门经理都是员工子类，需要重写打印工资方法。

class NormalEmp extends Employee {


	//1. 定义井初始化普通员工对象，调用打印工资方法输入工资，
	private double EmpSalary = getSalary() * getDay() * 1.0;
//1. 普通员工工资=单日工资*天数等级(1.0)


	public NormalEmp(String name, double salary, int day) {
		super(name, salary, day);
	}


	public double getEmpSalary() {
		return EmpSalary;
	}

	@Override
	public void printInfo() {
		System.out.println(getName() + "的工资为" + getEmpSalary());
	}
}

class Manager extends Employee {
	private double grade = 1.2;
	private double bonus;

	private double ManSalary = getBonus() + getSalary() * getDay() * this.getGrade();


	public Manager(String name, double salary, int day) {
		super(name, salary, day);
	}

	//设置奖金

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}


	public double getGrade() {

		return grade;
	}


	@Override
	public void printInfo() {
		System.out.println(getName() + "的工资为" + this.ManSalary);
	}
}

