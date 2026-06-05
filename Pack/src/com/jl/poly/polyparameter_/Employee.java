package com.jl.poly.polyparameter_;

public class Employee {
	private String name;
	private double months;

	public Employee() {

	}

	public Employee(String name, double months) {
		this.name = name;
		this.months = months;
	}

	public double getAnnual() {
		return this.months * 12;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMonths(double months) {
		this.months = months;
	}

	public String getName() {
		return name;
	}

	public double getMonths() {
		return months;
	}


}
