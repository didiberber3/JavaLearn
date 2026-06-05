package com.jl.string_;

public class StringExercise03 {
	public static void main(String[] args) {

		String a="hsp";//a 指向常量池
		String b=new String("hsp"); //指向堆中对象
		System.out.println(a.equals(b));   //t 值是相等的，
		System.out.println(a==b);//F 地址不同
		//intern()  返回常量池的地址
		System.out.println(a==b.intern());//t
		System.out.println(b==b.intern());//F
	}
}
