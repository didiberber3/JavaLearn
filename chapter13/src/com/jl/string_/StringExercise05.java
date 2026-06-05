package com.jl.string_;

public class StringExercise05 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "hspedu";
		Person p2 = new Person();
		p2.name = "hspedu";
		System.out.println(p1.name.equals(p2.name));//t 值相等 equals表示值相等
		System.out.println(p1.name == p2.name);//f  对象的属性存在对象中
		System.out.println(p1.name == "hspedu");//t 指向同一个常量，hspedu不是new出来的，所以p1直接指向了这个产量

		String s1 = new String("bcde");
		String s2 = new String("bcde");
		System.out.println(s1 == s2);//F


	}
}

class Person {
	String name;
}