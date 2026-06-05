package com.jl.string_;

public class StringExercise10 {
	String str = new String("jl");
	final char[] ch = {'j', 'a', 'v', 'a',};

	public void change(String str, char[] args) {
		str = "java";
		ch[0] = 'h';

	}

	public static void main(String[] args) {

		StringExercise10 ex = new StringExercise10();
		ex.change(ex.str, ex.ch);
		System.out.print(ex.str + "and");
		System.out.println(ex.ch);

	}
	//程序运行的结果
	//1.新建了一个str对象，对象在堆中，指向池中jl
	//2.final一个char数组，为 j a v a;
	//3.创建一个方法change，此方法为 将str=java，ch=h a v a
	//4.新建一个对象，对象ex用了change方法，运行3，此时str=java ch=hava
	//因为方法中的str是局部变量，没有添加this。
	//结果是：jlandhava;
	// 不加 this. 时，str = "java" 只是把方法参数（局部变量）指向了新字符串，不影响外部的 ex.str。
}
