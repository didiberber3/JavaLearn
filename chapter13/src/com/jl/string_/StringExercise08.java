package com.jl.string_;

public class StringExercise08 {
	public static void main(String[] args) {
		String a = "hello";
		String b = "abc";
		String c = a + b;
		//他是如何执行的？

		//C指向堆中的value再指向池中的helloabc，a和b指向池
		//创建了3个对象
		String d = "helloabc";
		System.out.println(c == d);//F
		String e = "hello" + "abc";
		System.out.println(d == e);//T

	}
}
