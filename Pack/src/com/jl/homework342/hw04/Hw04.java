package com.jl.homework342.hw04;

public class Hw04 {
	public static void main(String[] args) {

		new NormalEmp("曲小慧下士", 80, 30).printInfo();
		Manager Zky = new Manager("张开义将军", 100, 30);
		Zky.setBonus(1000);
		Zky.printInfo();
	}
}
