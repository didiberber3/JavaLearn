package com.jl.poly.polymethod;


public class PolyMethod {
	public static void main(String[] args) {
		//方法重载体现多态
		A a = new A();
		//传入不同的参数,调用不同的sum方法,就体现多态
		System.out.println("sum=" + a.sum(1, 2));
		System.out.println("sum=" + a.sum(1, 2, 3));

		//方法重写体现多态
		B b = new B();
		a.say();
		b.say();

	}
}

class B extends A {
	public void say() {
		System.out.println("B类中的方法被调用...");
	}
}

class A {

	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	public int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public void say() {
		System.out.println("A类中的say方法被调用...");
	}
}
