package com.jl.extend_;

public class Extends01 {
	public static void main(String[] args) {
		Pupil pupil = new Pupil();
		pupil.name = "小明";
		pupil.age = 12;
		pupil.testing();
		pupil.setScore(88.5);
		pupil.showInfo();

		System.out.println();
		Graduate graduate = new Graduate();
		graduate.name = "大明";
		graduate.age = 120;
		graduate.testing();
		graduate.setScore(1000);
		graduate.showInfo();

	}

}
