package com.jl.extend_;

public class Base extends TopBase{
	//四个属性
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;

	public Base() {
		System.out.println("Base无参构造器被调用...");
	}

	public Base(String name) {
		System.out.println("Base有参构造器(String name)被调用...");
	}

	public Base(String name, int age) {
		System.out.println("Base有参构造器(String name,int age)被调用...");
	}

	public void m1() {
		//该方法可以访问四个属性
		System.out.println("n1=" + n1 + " n2=" + n2 + " n3=" + n3 + " n4=" + n4);
	}

	protected void m2() {
	}

	void m3() {
	}

	private void m4() {
	}

	//在同一个类中可以访问所有修饰符
	public void hi() {
		m1();
		m2();
		m3();
		m4();
	}
}
