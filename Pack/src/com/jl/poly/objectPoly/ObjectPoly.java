package com.jl.poly.objectPoly;

public class ObjectPoly {
	public static void main(String[] args) {
		//编译类型 对象名 = 新建对象 运行类型
		Animal animal = new Dog();
		animal.cry();   //执行到该行时,animal运行类型是Dog,所以这个cry是dog的cry

		animal = new Cat();
		animal.cry();   //此处运行类型变成了猫


	}
}
