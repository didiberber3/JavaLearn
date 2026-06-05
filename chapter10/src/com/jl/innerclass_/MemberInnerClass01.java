package com.jl.innerclass_;

public class MemberInnerClass01 {
	public static void main(String[] args) {
		Outer08 outer08 = new Outer08();
		outer08.t1();
		//外部其他类,使用成员内部类的三种方式
		//1. outer08.new.Inner08();
		Outer08.Inner08 inner08 = outer08.new Inner08();
		outer08.getInner08Instance();
	}
}

class Outer08 {
	private int n1 = 10;
	public String name = "jackie3";
	//定义成员内部类
	private void hi() {
		System.out.println("Method hi()");
	}
	class Inner08 {
		public double sal = 99.9;
		private int n1 = 555;

		public void say() {
			System.out.println("class Inner08中的n1=" + n1 + "\tname=" + name
					+ "\nOuter中的n1=" + Outer08.this.n1);
			hi();   //直接访问外部类
		}
	}
	public Inner08 getInner08Instance() {
		return new Inner08();
	}
	public void t1() {
		//使用成员内部类
		//创建内部类对象,然后使用相关属性或方法
		Inner08 inner08 = new Inner08();
		inner08.say();
		System.out.println(inner08.sal);
	}
}