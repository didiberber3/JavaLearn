package com.jl.generic.customgeneric;


import java.util.ArrayList;

public class CustomMethodGeneric {
	public static void main(String[] args) {

		Car car = new Car();
//		调用方法时传入参数，编译器自行确定对应的类型
		car.m2("宝马", 100);
		System.out.println("=======");
		car.m2(300, 100.1);

		System.out.println("============================");


		Fish<String, ArrayList> arrayListStringFish = new Fish<>();
		arrayListStringFish.fly(new ArrayList<>(), "10000");
	}
}

class Car { //普通类
	public void m1() {
	}

	//泛型方法
	public <T, R> void m2(T t, R r) {
		System.out.println(t.getClass());
		System.out.println(r.getClass());
	}
}

class Fish<T, R> {//泛型类

	//普通方法
	public void run() {
	}

	//	泛型方法
	public <U, M> void eat(U u, M m) {
	}

	public <K> void fly(K k, T t) {
		System.out.println(k.getClass());
		System.out.println(t.getClass());
	}
}