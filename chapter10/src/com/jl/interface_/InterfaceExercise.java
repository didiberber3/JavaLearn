package com.jl.interface_;

public class InterfaceExercise {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);//23 b对象访问public a属性
		System.out.println(AA.a);//23 接口名.属性名
		System.out.println(B.a);//23 AA中的属性是static修饰符,所以可以使用B类中的a属性
	}
}

interface AA{
	int a=23;
}
class B implements AA{

}
