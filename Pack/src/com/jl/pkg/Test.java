package com.jl.pkg;

import com.jl.modifier.A;

public class Test {
	//现在和A B Test 类处在不同包
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.n1);//在不同包下只能访问public

		a.m1();
		/*
		a.m2();
		a.m3();
		a.m4();
		*/
	}
}
