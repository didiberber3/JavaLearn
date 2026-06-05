package com.jl.poly.polyparameter_;

public class Manager extends Employee {
	private double bonus;

	public Manager(String name, double months, double bonus) {
		super(name, months);
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void manage() {
		System.out.println("经理" + getName() + "正在管理...");
	}


	public double getAnnual() {
		return super.getMonths() + this.bonus;

	}
}
