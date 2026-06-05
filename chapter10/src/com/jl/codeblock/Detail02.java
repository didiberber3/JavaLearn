package com.jl.codeblock;

public class Detail02 {
	public static void main(String[] args) {
//		AAA aaa = new AAA();
		BBB bbb = new BBB();
	}
}

class AAA {
	{
		System.out.println("AAA普通代码块");
	}

	public AAA() {
		//隐藏了super();
		System.out.println("AAA构造器被调用");
	}
}

class BBB extends AAA{
	{
		System.out.println("BBB普通代码块");
	}

	public BBB() {
		System.out.println("BBB构造器被调用");
	}
}