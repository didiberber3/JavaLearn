package com.jl.wrapper;

public class Integer01 {
	public static void main(String[] args) {
//		演示int 和Integer 的装箱和拆箱
//		jdk5之前是手动装拆：
		int n1 = 100;
		//装
		Integer integer = new Integer(n1);
		Integer integer1 = Integer.valueOf(n1);

		//拆
		int i = integer.intValue();

//		jdk5以后可以自动装拆
		int n2 = 200;       //n2为基本数据类型
//		自动装箱
		Integer integer2 = n2; //底层使用的Integer.valueOf(n2)
//		自动拆箱

		int n3 = integer2;  //把对象给数据类型看上去是不行的，实际上底层仍然使用 Integer.valueOf(n2)

	}
}
