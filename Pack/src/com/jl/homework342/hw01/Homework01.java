package com.jl.homework342.hw01;

public class Homework01 {
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person("张开义", 22, "局长");
		persons[1] = new Person("小琪", 25, "美国总统");
		persons[2] = new Person("kobe", 24, "sports");

		//输出当前的对象的数组

		Person temp = null;
		for (int i = 0; i < persons.length - 1; i++) {
			for (int j = 0; j < persons.length - i - 1; j++) {
				//按照age 从大到小排<  -
				//由于是多态数组,此if需要单独捕获person数组中的age数值
				//如果要按照 从小到大排列 >
				if (persons[j].getAge() < persons[j + 1].getAge()) {
					//如果前面的人的年龄小 小于后面人的年龄 就交换
					temp = persons[j];
					persons[j] = persons[j + 1];
					persons[j + 1] = temp;

				}
				//如果要按名字长度大小 getName().length
			}
		}
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);
		}
	}
}



class Person {
	private String name;
	private int age;
	private String job;

	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getJob() {
		return job;
	}

	@Override
	public String toString() {
		return "信息: " +
				"姓名: " + name + '\'' +
				", 年龄: " + age +
				", 工作: " + job + '\''
				;
	}
}
