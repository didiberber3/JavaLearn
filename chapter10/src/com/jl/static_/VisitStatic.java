package com.jl.static_;

public class VisitStatic {

	public static void main(String[] args) {
		//类名.类变量名
		//说明随着类的加载,即使没有创建对象,类变量也可以访问
		System.out.println(A.name);
		//通过 对象名.类变量名 也可以访问
		A a = new A();
		System.out.println(a.name);
	}
}

class A {
	//类变量
	public static String name = "牛牛";
	//普通属性 普通成员变量 非静态变量 非静态成员变量 实例变量
	private int num = 1;
}