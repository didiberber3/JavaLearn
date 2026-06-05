package com.jl.homework_;

import java.util.HashSet;

public class h6 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		Person1 p1 = new Person1(1001, "AA");
		Person1 p2 = new Person1(1002, "BB");
		set.add(p1);
		set.add(p2);
		p1.name = "CC";
		set.remove(p1);
		System.out.println(set);
		set.add(new Person1(1001, "CC"));
		System.out.println(set);
		set.add(new Person1(1001, "AA"));
		System.out.println(set);
	}
}

class Person1 {

	 int num;
	 String name;

	public Person1(int num, String AA) {
		this.num = num;
		this.name = AA;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}