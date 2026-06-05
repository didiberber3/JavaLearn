package com.jl.hm;

public class Hm03 {
	public static void main(String[] args) {
//在测试类中实例化对象Animal cat =new Cat(),并调用cat的shout方法；
		Animal cat = new Cat();
		cat.shout();
//在测试类中实例化对象Animal dog =new Dog(),并调用dog的shout方法。
		Animal dog = new Dog();
		dog.shout();
	}
}

//编程题 Homework03.java
//
//按要求实现下列问题：
//
//动物类Animal包含了抽象方法 shout()；
abstract class Animal {
	abstract void shout();
}

//Cat类继承了Animal，并实现方法shout，打印 “猫会喵喵叫”；
class Cat extends Animal {
	@Override
	void shout() {
		System.out.println("“猫会喵喵叫”");
	}
}

//Dog类继承了Animal，并实现方法shout，打印 “狗会汪汪叫”；
class Dog extends Animal {
	@Override
	void shout() {
		System.out.println("“狗会汪汪叫”");
	}
}

