package com.jl.string_;

public class StringExercise04 {
	public static void main(String[] args) {
		String s1="hspedu"; //指向常量池
		String s2="java";   //指向Java
		String s4="java";   //指向同一个Java
		String s3=new String("java");   //new出来的 指向堆 堆中对象value指向java地址
		System.out.println(s2==s3); //F
		System.out.println(s2==s4); //T //指向的同一个地址，没有新建对象，引用了
		System.out.println(s2.equals(s3));//T
		System.out.println(s1==s2);//F

	}
}
