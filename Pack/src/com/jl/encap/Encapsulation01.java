package com.jl.encap;

public class Encapsulation01 {
	public static void main(String[] args) {
		Person person;
		person = new Person();
		person.setName("cxkImDeadMan");
		person.setAge(3000);
		person.setSalary(2000);
		System.out.println(person.info());
		//person.age="cxk"; 私有化的
		Person jack = new Person("jack", 19, 1000);
		System.out.println(jack.info());
	}
}

class Person {
	public String name;     //姓名公开
	private int age;        //年龄私有化
	private double salary;

	public Person() {
	}

	//有三个属性的构造器
	public Person(String name, int age, double salary) {
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
		//将set方法写在构造器中
		setName(name);
		setAge(age);
		setSalary(salary);
	}

	//自己写set和get太慢了，使用Keymap 然后根据需求完善代码

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {
		//加入对数据的校验
		if (name.length() >= 2 && name.length() <= 6) {
			this.name = name;
		} else {
			System.out.println("名字长度超限（2-6个字符），已设置默认名字");
			this.name = "Manba";
		}
	}

	public void setAge(int age) {
		//加入对对象的校验，以增加业务逻辑
		if (age >= 1 && age <= 120) {   //if right,setAge
			this.age = age;
		} else {
			System.out.println("年龄长度超限（1-120岁），已设置默认年龄");
			this.age = 18;  //给一个默认年龄
		}
	}

	public void setSalary(double salary) {
		//增加对当前对象的权限判断 eg权限不够则不返回
		this.salary = salary;
	}

	//写一个方法返回属性信息
	public String info() {
		return "person的信息为：\n姓名：" + name +
				"\t年龄：" + age + "\t薪水：" + salary;
	}
}