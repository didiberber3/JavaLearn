package com.jl.homework342.hw03;

public class Homework03 {
	public static void main(String[] args) {
		Teacher Default = new Teacher("TeacherD", 18, "Teacher", 1000);
		System.out.println(Default.introduce());
		Teacher XiaoQi = new Professor("小琪", 18, "小嘉的睡觉教授", 10000);
		System.out.println(XiaoQi.introduce());
		Teacher XiaoQi1 = new SecondProfessor("小琪", 18, "小嘉的睡觉副教授", 10000);
		System.out.println(XiaoQi1.introduce());
		Teacher XiaoQi2 = new NormalTeacher("小琪", 18, "小嘉的睡觉老师", 10000);
		System.out.println(XiaoQi2.introduce());
	}
}


