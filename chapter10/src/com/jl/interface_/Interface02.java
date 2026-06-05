package com.jl.interface_;

public class Interface02 {
	public static void main(String[] args) {

	}
}

//1. 如果一个类 implements(实现) 一个interface(接口)了
//2. 需要将该接口的所有抽象方法都实现
class A implements AInterface {
	@Override
	public void hi() {
		System.out.println("hi");
	}
}