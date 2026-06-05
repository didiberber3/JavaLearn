package com.jl.poly.polyparameter_;

public class NormalEmployee extends Employee {
	public NormalEmployee(String name, double months) {
		super(name, months);
	}

	public void work() {
		System.out.println("普通员工" + getName() + "正在工作...");
	}

	public double getAnnual() {
		return super.getAnnual();
	}
}
