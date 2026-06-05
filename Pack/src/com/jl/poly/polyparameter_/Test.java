package com.jl.poly.polyparameter_;

public class Test {


	public void showEmpAnnal(Employee e) {

		if (e instanceof NormalEmployee) {
			System.out.println("普通员工" + e.getName() + "年度总工资为\t" + e.getAnnual());

		} else if (e instanceof Manager) {
			((Manager) e).getAnnual();
			System.out.println("经理" + e.getName() + "的年度总工资为\t" + e.getAnnual());
		}
	}

	public void testWork(Employee e) {
		if (e instanceof NormalEmployee) {
			((NormalEmployee) e).work();
		} else if (e instanceof Manager) {
			((Manager) e).manage();
		}
	}
}

