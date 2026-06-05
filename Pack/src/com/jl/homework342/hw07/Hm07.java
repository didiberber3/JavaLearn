package com.jl.homework342.hw07;

public class Hm07 {

}


class Demo extends Test {
	public static void main(String[] args) {

		new Demo().test();
		//这个匿名对象没有传进参数,所以使用Demo(),并运行test()
		//1--Demo()
		// 1. 不向上传递参数super()调用Test无参构造器:输出"Test"字符串
		// 2. 输出"Demo"字符串
		//2--test()方法
		// 3. 打印输出super.name 此时super.name是Test中的 输出"Rose"字符串
		// 4. 打印输出this.name 此时this.name是Demo中的 输出"Jack"字符串
		new Demo("john").test();

		//这个匿名传进了john参数 所以调用Demo(String s)构造器并运行test()方法
		//1--Demo(String s)
		// 1. 向上传递参数String s 调用Test String name构造器 此构造器将Test的name改成john
		//2.--test()方法
		// 1. 打印输出super.name 此时Test中的name是john所以输出"john"字符串
		// 2. 打印输出this.name此时this.name是Demo中的"Jack" 输出Jack字符串
		//输出结果 Test Demo Rose Jack john Jack

	}
	String name = "Jack";
	Demo() {
		super();
		System.out.println("Demo");
	}

	public Demo(String s) {
		super(s);
	}

	public void test() {
		System.out.println(super.name);
		System.out.println(this.name);

	}

}
class Test {
	String name = "Rose";
	//john

	Test() {
		System.out.println("Test");
	}

	Test(String name) {
		this.name = name;

	}
}
