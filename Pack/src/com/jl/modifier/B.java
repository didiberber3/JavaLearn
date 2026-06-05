package com.jl.modifier;

public class B {
	public void say() {
		A a = new A();
		//在同一个包下，可以访问public protected 默认，不能访问private
		System.out.println("n1=" + a.n1 + " " + "n2=" + a.n2 + " " + "n3=" + a.n3 + " ");
		//System.out.println("n4" = a.n4);
		a.m1();
		a.m2();
		a.m3();
		//a.m4(); 不能访问m4
	}
}
