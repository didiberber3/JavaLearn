package com.jl.wrapper;

public class WrapperExercise01 {
	public static void main(String[] args) {
		//1.
		Double d = 100d;    //可以 自动装箱 Double.valueOf(100d)
//		100d是一个double类型的100=100.00
		Float f = 1.5f;     //可以 自动装箱 Float.valueOf(1.5f)
		//2.
		Object obj1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(obj1);  //此处控制台输出1.0 因为在三元运算符中最大精度为double 三元运算符是一个整体,返回最大数值类型
		//3.
		Object obj2;
		if (true)
			obj2 = new Integer(1);
		else
			obj2 = new Double(2.0);
		System.out.println(obj2);   //输出 1 if else 不是一个整体 控制台输出 1 分别计算
	}
}
