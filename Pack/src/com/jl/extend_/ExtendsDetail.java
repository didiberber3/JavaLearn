package com.jl.extend_;

public class ExtendsDetail {
	public static void main(String[] args) {
		System.out.println("\n---第1个对象---");
		Sub sub = new Sub();

		System.out.println("\n---第2个对象---");
		Sub sub1 = new Sub("jack");

		System.out.println("\n---第3个对象---");
		Sub sub2 = new Sub( "jack", 30);
	}
}
