package com.jl.extend_;

public class Sub extends Base {

	public Sub() {  //sub无参构造器
		//do nothing.
		super();
		System.out.println("无参构造器被调用..");
	}


	public Sub(String name) {   //sub String name构造器
		super("tom");
		System.out.println("Sub name构造器被调用");
	}

	public Sub(String name, int age) {

		super("smith", 10);//调用父类无参构造器，或不写
		System.out.println("sub String name int age构造器被调用");
	}
}
