package com.jl.main_;

public class Hello {
	private static String name = "hsp教育";

	private int num = 10000;
	public void ok(){
		System.out.println("Cry方法");
	}

	public static void hi() {
		System.out.println("Main01的hi方法");
	}

	public static void main(String[] args) {

		// 静态方法可以访问本类的静态成员
		System.out.println("name=" + name);
		hi();

		//静态方法不可以访问本类的非静态成员
		//System.out.println("num=" + num);
		//ok();

		//一定要使用,请创建对象.
		Hello hello = new Hello();
		System.out.println("num"+hello.num);
		hello.ok();

	}
}
