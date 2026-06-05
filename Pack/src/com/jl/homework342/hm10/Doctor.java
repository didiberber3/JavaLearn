package com.jl.homework342.hm10;

import javax.print.Doc;

public class Doctor {
	private String name;
	private int age;
	private String job;
	private char gender;
	private double salary;

	public Doctor(String name, int age, String job, char gender, double salary) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.gender = gender;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		//判断obj 是否是Doctor类型或其子类
		if (!(obj instanceof Doctor)) {
			return false;
		} else {
			//向下转型
			Doctor obj1 = (Doctor) obj;
			return this.name.equals(obj1.name)
					&& this.age == obj1.age
					&& this.gender == obj1.gender
					&& this.job.equals(obj1.job)
					&& this.salary == obj1.salary;
		}
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
