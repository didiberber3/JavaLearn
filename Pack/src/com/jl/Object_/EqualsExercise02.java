package com.jl.Object_;

public class EqualsExercise02 {

	public static void main(String[] args) {
		Person_ p1 = new Person_();
		p1.name = "hspedu";
		Person_ p2 = new Person_();
		p2.name = "hspedu";

		System.out.println(p1 == p2); // False
		System.out.println(p1.name.equals(p2.name)); // True
		System.out.println(p1.equals(p2)); // False

		String s1 = new String("asdf");
		String s2 = new String("asdf");
		System.out.println(s1.equals(s2)); // True
		System.out.println(s1 == s2); // False
	}
}


class Person_ {
	public String name;
}
