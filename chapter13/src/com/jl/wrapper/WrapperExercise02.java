package com.jl.wrapper;
public class WrapperExercise02 {
	public static void main(String[] args) {
		new A().method1();
	}
}
class A {
	public void method1() {
		//创建对象
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j); //F     //new出来的对象，==用于比较是不是同一个对象
		//包装int类
		Integer m = 1;  //Integer.valueOf() 取值范围为 -128~127，
		Integer n = 1;


		System.out.println(m == n); //true
		//如果不在范围内，则用创建对象的方式
		Integer a = 188;
		Integer b = 188;
		System.out.println(a==b);   //false

		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y); //false 不在取值范围内    -128~127

	}
}

