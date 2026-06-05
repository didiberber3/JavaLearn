package com.jl.static_;

public class StaticDetail {

	public static void main(String[] args) {
		D.hi();


		D d = new D();
		d.say();


		System.out.println();
		D.n();
	}
}

class D {
	public static int n2 = 200;


	public  void say() {
		System.out.println("Say~~~GoodBye~~~~");
	}

	public static void hi() {
		System.out.println("Hi~~~");
	}

	public static void eatJ8() {
		System.out.println("发现美味佳肴");
	}

	//类方法中只能使用静态变量或静态方法
	public static void n(){
		System.out.println(n2);
		System.out.println(D.n2);
//		System.out.println(/*this.*/n2);
//		System.out.println(/*super.*/n2);
		//不能使用对象相关的关键字
		hi();
//		say();

	}

}