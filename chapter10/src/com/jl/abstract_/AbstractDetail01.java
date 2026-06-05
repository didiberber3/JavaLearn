package com.jl.abstract_;

public class AbstractDetail01 {
	public static void main(String[] args) {

		//'Cat' is abstract; cannot be instantiated
		//抽象类不能被实例化
//		Cat cat = new Cat();
	}
}

//抽象类可以没有抽象方法
abstract class Cat {

	//还有可以实现的方法
	public void hi() {
		System.out.println("hi");
	}
}

//一旦抽象类包含了abstract方法,则这个类必须声明为abstract类
abstract class Dog {
	public abstract void say();
}

//abstract只能抽象类和方法,不能修饰其他的
class A {
	public /*abstract*/ int num1 = 10;
}
