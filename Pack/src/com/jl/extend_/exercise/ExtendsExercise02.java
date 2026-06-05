package com.jl.extend_.exercise;

public class ExtendsExercise02 {
	public static void main(String[] args) {
		C1 c = new C1();


		/*Command
		 * 我是A类
		 * hahaha我是B类的有参构造
		 * 我是c类的有参构造
		 * 我是c类的无参构造
		 * */
	}
}

class A1 {
	public A1() {
		//super();
		System.out.println("我是A类");
	}
}

class B1 extends A1 {
	public B1() {
		System.out.println("我是B类的无参构造");
	}

	public B1(String name) {
		//super();
		System.out.println(name + "我是B类的有参构造");
	}
}

class C1 extends B1 {
	public C1() {
		this("hello");
		System.out.println("我是c类的无参构造");
	}

	public C1(String name) {
		super("hahaha");
		System.out.println("我是c类的有参构造");
	}
}