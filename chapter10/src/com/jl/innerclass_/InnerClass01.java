package com.jl.innerclass_;

public class InnerClass01 { //外部其他类
	public static void main(String[] args) {

	}
}

class Outer {   //外部其他类
	//属性
	private int n1 = 10;

	//构造器
	public Outer(int n1) {
		this.n1 = n1;
	}

	//方法
	public void m1() {
		System.out.println("m1");
	}

	//代码块
	{
		System.out.println("CodeBlock...");
	}

	class Inner {    //内部类,在Class Outer的内部

	}
}