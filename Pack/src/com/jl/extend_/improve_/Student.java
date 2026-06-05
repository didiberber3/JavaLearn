package com.jl.extend_.improve_;

//父类，是pupil和Graduate的父亲
public class Student {
	public String name;
	public int age;
	public double score;

	public void setScore(double score) {
		this.score = score;
	}


	public void showInfo() {
		System.out.println("学生" + name + " 年龄" + age + " 分数" + score);
	}

}
