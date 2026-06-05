package com.jl.poly.dynamic_;

public class dynamic_ {
	public static void main(String[] args) {
		//运行类型是B
		A a = new B();

		System.out.println(a.sum());//40
		System.out.println(a.sum1());//30
		System.out.println(a.sum2());//12
		//Terminal




	}
}

class A {
	public int i = 10;

	public int sum() {
		return getI() + 10;
	}

	public int sum1() {
		return i + 10;
	}

	public int sum2() {
		return i + 2;
	}

	public int getI() {
		return i;
	}
}

class B extends A {
	public int i = 20;

//	public int sum() {
//		return i + 20;
//	}

	public int sum1() {
		return i + 10;
	}

	public int getI() {
		return i;
	}
}