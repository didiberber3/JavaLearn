package com.jl.modifier;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		B b = new B();
		b.say();
	}
}
//只有默认和public可以修饰类
//XXX protected XXX class Tiger{ } 不可以使用protected修饰类