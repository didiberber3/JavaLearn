package com.jl.Object_;

public class EqualsExercise01 {
	public static void main(String[] args) {
		Person person1 = new Person("蔡徐坤", 25, '男');
		Person person2 = new Person("蔡徐坤", 25, '男');
		Person person3 = new Person("科比", 24, '男');

		System.out.println(person1.equals(person2));//true
		System.out.println(person2.equals(person3));//false
		//重写.equals()方法
		System.out.println();
	}

}


class Person {      //默认继承Object类,默认比较两个对象是否相等
	private String name;
	private int age;
	private char gender;

	public boolean equals(Object obj) {
		//判断比较的两个对象是同一个对象,则直接返回true
		if (this == obj) {
			return true;
		}
		//类型比较
		if (obj instanceof Person) { //是Person类中的对象,才比较

			//类型转换
			//因为我需要得到obj的属性,所以需要向下转型
			Person p = (Person) obj;
			return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
		}
		//如果不是同一个Person,则直接返回false
		return false;
	}

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}