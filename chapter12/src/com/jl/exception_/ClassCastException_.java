package com.jl.exception_;

public class ClassCastException_ {
	public static void main(String[] args) {

		A b = new B();
		B b2 = (B) b;

		try {
			C c2 = (C) b;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

class A {
}

class B extends A {
}

class C extends A {
}