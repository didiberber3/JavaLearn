package com.jl.generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class GenericExercise2 {
	/*
	 * 定义Employe 类
	 * 1) 该类包含:private成员变量name,sal,birthday,其中 birthday 为 MyDate 类的对象
	 * 2)为每一个属性定义getter,setter方法;
	 * 3)重 toString 方法输出 name, sal, birthday
	 * 4) MyDate类包含:private成员变量month,day,year;并为每一个属性定义 getter,.setter方法;
	 * 5)创建该类的3个对象，并把这些对象放入ArrayList集合中(ArrayList 需使用泛型来定义)，
	 * 对集合中的元素进行排序，并遍历输出:排序方式:调用ArrayList的 sort 方法，
	 * 传入Comparator对象[使用泛型]，先按照name排序，如果name相同，则按生日日期的先后排序。
	 * 【即:定制排序】有一定难度，比较经典泛型使用案例*/


	public static void main(String[] args) {
//		创建员工对象
		Employee employee = new Employee("cool", 2000, new MyDate(2016, 3, 8));
		Employee employee1 = new Employee("tom", 2800, new MyDate(2004, 4, 18));
		Employee employee2 = new Employee("jason", 2000, new MyDate(2003, 12, 21));
		Employee employee3 = new Employee("jason", 2000, new MyDate(2003, 1, 21));
		Employee employee4 = new Employee("tom", 2000, new MyDate(2004, 12, 19));
//		创建数组
		ArrayList<Employee> employees = new ArrayList<>();
//		添加对象到数组
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
//		排序
		employees.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				// 先按名字排序
				int nameCompare = o1.getName().compareTo(o2.getName());

				// 如果名字不同，直接返回名字比较结果
				if (nameCompare != 0) {
					return nameCompare;
				}

				// 比较生日
				return o1.getBirthday().compareTo(o2.getBirthday());
			}
		});

		System.out.println(employees);

	}
}

class Employee {
	private String name;
	private double sal;
	private MyDate birthday;

	public Employee(String name, double sal, MyDate birthday) {
		this.name = name;
		this.sal = sal;
		this.birthday = birthday;
	}

	public MyDate getBirthday() {
		return birthday;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Employee)) return false;
		Employee employee = (Employee) o;
		return Double.compare(sal, employee.sal) == 0 && Objects.equals(getName(), employee.getName()) && Objects.equals(birthday, employee.birthday);
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), sal, birthday);
	}

	@Override
	public String toString() {
		return "{" + "姓名='" + name + '\'' + ", 生日=" + birthday + '}';
	}
}

//	MyDate类
class MyDate implements Comparable<MyDate> {
	private int year;
	private int month;
	private int day;

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MyDate)) return false;
		MyDate myDate = (MyDate) o;
		return year == myDate.year && month == myDate.month && day == myDate.day;
	}

	@Override
	public int hashCode() {
		return Objects.hash(year, month, day);
	}


	@Override
	public String toString() {
		return year + "年" + month + "月" + day + "日";
	}

	@Override
	public int compareTo(MyDate o) {
		// 先比较年
		int yearCompare = this.year - o.year;
		if (yearCompare != 0) {
			return yearCompare;
		}

		// 年相同，比较月
		int monthCompare = this.month - o.month;
		if (monthCompare != 0) {
			return monthCompare;
		}

		// 年月都相同，比较日
		return this.day - o.day;
	}
}
