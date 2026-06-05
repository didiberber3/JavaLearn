package com.jl.homework342.hm13;

public class Homework13 {
	public static void main(String[] args) {
		Person p = new Person();


		Student student = new Student("小琪", '女', 18, 10086);
		Teacher teacher = new Teacher("小嘉", '男', 80, 60);
//		p.action(teacher);
//		p.action(student);
//		System.out.println(teacher.getAge());

		student.showInfo();
		System.out.println("------------------------");
		teacher.showInfo();
//定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序。
//		Person[] persons = new Person[4];
//		persons[0] = new Student("小琪", '女', 18, 10086);
//		persons[1] = new Teacher("大琪", '男', 30, 15);
//		persons[2] = new Student("超小琪", '女', 14, 10010);
//		persons[3] = new Teacher("超大琪", '男', 90, 70);
//		p.arrayBubbleSort(persons);

	}


}

