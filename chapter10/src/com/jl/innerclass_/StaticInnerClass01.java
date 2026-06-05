package com.jl.innerclass_;

public class StaticInnerClass01 {
	public static void main(String[] args) {
		Outer09 outer09 = new Outer09();
		outer09.m1();
		//外部其他类 使用静态内部类
		//方式1 因为静态内部类是可以通过类名直接访问的(有访问权限)
		Outer09.Inner10 inner10 = new Outer09.Inner10();
		inner10.say();

		//方式2
		//编写一个方法,可以返回静态内部类的对象实例
		System.out.println("=============");
		Outer09.Inner10 inner11 = outer09.getInner10();
		Outer09.Inner10 inner12 = outer09.getInner10_();

		System.out.println("*****************************");
		//方式三
		inner12.say();


	}
}

class Outer09 {
	private int n1 = 10;
	private static String name = "张三";

	private static void cry() {
	}

	//Inner10就是静态内部类
	//1. 放在外部类的成员位置
	//2. static修饰
	//3. 不能直接访问非静态成员
	//4. 可以添加任意访问修饰符(public protected 默认 private)因为它的地位就是一个成员
	static class Inner10 {
		private static String name = "JB玉";

		public void say() {
			//重名就近访问,访问外部需要 OuterClass.var;
			System.out.println(name);
			System.out.println(Outer09.name);
			cry();
		}
	}

	public void m1() {
		Inner10 inner10 = new Inner10();
		inner10.say();
	}

	public Inner10 getInner10() {
		return new Inner10();
	}

	static public Inner10 getInner10_() {
		return new Inner10();
	}
}

