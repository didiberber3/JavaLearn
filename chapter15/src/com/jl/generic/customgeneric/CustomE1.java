package com.jl.generic.customgeneric;

public class CustomE1 {
	public static void main(String[] args) {

		Apple<String, Integer, Double> apple = new Apple<>();
		apple.fly(10);  //Integer
		apple.fly(new Dog());//Dog
	}
}

class Apple<T, R, M> {
	public <E> void fly(E e) {
		System.out.println(e.getClass().getSimpleName());
	}

	public <U> void eat(U u) {
	}

	public void run(M m) {
	}
}

class Dog {
}