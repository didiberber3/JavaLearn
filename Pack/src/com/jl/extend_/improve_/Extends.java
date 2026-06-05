package com.jl.extend_.improve_;

public class Extends {
	public static void main(String[] args) {
		Pupil pupil = new Pupil();
		pupil.name = "小明";
		pupil.age = 12;
		pupil.testing();
		pupil.setScore(50);
		pupil.showInfo();

		System.out.println();
		Graduate graduate = new Graduate();
		graduate.name = "大明";
		graduate.age = 110;
		graduate.testing();
		graduate.setScore(3000);
		graduate.showInfo();

	}

}
