
// 修改后
package com.jl.extend_;

public class Graduate {
	//模拟学生考试情况 easily
	public String name;
	public int age;
	private double score;

	public void setScore(double score) {
		this.score = score;
	}


	public void showInfo() {
		System.out.println("学生" + name + " 年龄" + age + " 分数" + score);
	}

	public void testing() {
		System.out.println("学生" + name + "正在考试...");
	}
}

