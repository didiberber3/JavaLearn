package com.jl.final_;

public class FinalDetail02 {
	public static void main(String[] args) {
		System.out.println(BBB.num);
	}
}

class BBB {
	public static int num = 1000;

	static {
		System.out.println("BBB类静态代码块被执行...");
	}
}

final class AAA {

	//Method declared 'final' in 'final' class
	//一般来说 如果一个类已经是final类 就没有必要再将方法修饰成final方法
	//public final void cry(){}

}