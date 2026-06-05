package com.jl.homework342.hm13;

//抽取一个父类 Person 类，
// 将 Student 和 Teacher 类的共同属性和方法放到 Person 类中。
public class Person {
	private String name;
	private char sex;
	private int age;

	public Person() {

	}

	public Person(String name, char sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// （其中xx分别代表学生和老师的姓名）。
	// 因为玩的方法名称都一样，所以要求此方法定义在父类中，子类实现重写。
	public void play() {
		System.out.println("人爱玩点什么...");
	}

	@Override
	public String toString() {
		return (getName() + "的信息为: "
				+ "年龄" + getAge() + "性别:" + getSex());
	}

	//定义方法，形参为 Person 类型，功能：调用学生的 study 或教师的 teach 方法。
	public void action(Person p) {
		if (p instanceof Teacher) {
			((Teacher) p).teach();

		}
		if (p instanceof Student) {
			((Student) p).study();
		}

	}

	public String  basicInfo() {
		return ("姓名: " + getName()
						+ "\n年龄: " + getAge()
						+ "\n性别: " + getSex());

	}



	//冒泡排序年龄从大到小
	public void arrayBubbleSort(Person[] persons) { // 定义一个方法，用于对Person数组进行冒泡排序
		Person tmp = null; // 创建一个临时变量，用于在交换过程中存储Person对象


		for (int i = 0; i < persons.length - 1; i++) {// 外层循环控制排序的轮数，每轮都会将最小的元素“冒泡”到数组的末尾

			for (int j = 0; j < persons.length - 1 - i; j++) {    // 内层循环进行实际的比较和交换操作

				if (persons[j].getAge() < persons[j + 1].getAge()) {// 如果当前元素的年龄小于下一个元素的年龄，则需要交换这两个元素
					tmp = persons[j]; // 将较小的元素（persons[j]）存储到临时变量tmp中
					persons[j] = persons[j + 1]; // 将较大的元素（persons[j + 1]）移动到当前位置
					persons[j + 1] = tmp; // 将临时变量tmp中的较小元素移动到下一个位置
				}
			}
		}
		// 排序完成后，输出排序后的数组
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]); // 打印每个Person对象的信息
		}
	}
}
