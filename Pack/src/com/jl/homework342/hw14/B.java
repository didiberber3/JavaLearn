package com.jl.homework342.hw14;

public class B extends A{
	public B(){
		System.out.println("我是B类的无参构造器");
	}
	public B(String name){
//		super();
		System.out.println(name+"我是B类有参构造器");
	}
}
