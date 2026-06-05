package com.jl.poly.polyparameter_;

public class PolyParameter {
	public static void main(String[] args) {
		Employee[] employees = new Employee[3];

		employees[0] = new NormalEmployee("ikun2", 3000);
		employees[1] = new Manager("ikun3", 3000, 20000);

		Test e = new Test();
		e.showEmpAnnal(employees[0]);
		e.showEmpAnnal(employees[1]);
		System.out.println();
		e.testWork(employees[0]);
		e.testWork(employees[1]);
	}


}
