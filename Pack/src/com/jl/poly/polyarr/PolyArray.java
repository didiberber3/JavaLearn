package com.jl.poly.polyarr;


public class PolyArray {
	public static void main(String[] args) {
		Person[] persons = new Person[5];//多态数组
		persons[0] = new Person("jack", 20);
		persons[1] = new Student("jackie", 18, 100);
		persons[2] = new Student("Caixk", 25, 59.5);
		persons[3] = new Teacher("Kobe", 24, 20000);
		persons[4] = new Teacher("Hansp", 48, 25000);
		//循环遍历多态数组 调用say()
		for (int i = 0; i < persons.length; i++) {

			System.out.println(persons[i].say());
			//向下转型
			if (persons[i] instanceof Teacher) {    //使用instantOf判断 向下转型

				//类型转换的两种形式 1
				((Teacher) persons[i]).teach();

				System.out.println();
			} else if (persons[i] instanceof Student) {

				//类型转换的两种形式 2
				Student students = (Student) persons[i];
				students.study();

				System.out.println();
			} else if (persons[i] instanceof Person) {

				System.out.println("你是人");
			} else {
				System.out.println("你的类型有误,请重新检查...");
			}
		}
	}
}
