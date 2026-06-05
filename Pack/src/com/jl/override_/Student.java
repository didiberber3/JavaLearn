package com.jl.override_;

public class Student extends Person {
	private int id;
	private double score;

	//同Person
	public Student() {

	}

	public void setId(int id) {
		this.id = id;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public double getScore() {
		return score;
	}

	//返回String语句,并用super调用父类Person的say方法
	public String say() {
		return super.say() + "|我的id是" + this.id + "我的分数是" + this.score;
	}
}
