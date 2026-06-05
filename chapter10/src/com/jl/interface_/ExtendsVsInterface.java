package com.jl.interface_;

public class ExtendsVsInterface {
	public static void main(String[] args) {
		LittleMonkey littleMonkey = new LittleMonkey("悟空");
		littleMonkey.climbing(); // 继承类得来的会爬树
		littleMonkey.flying(); // 实现接口学会的flying
		littleMonkey.swimming(); // 实现接口学会的swimming
	}
}

// 类
class Monkey {
	private String name;

	public Monkey(String name) {
		super();
		this.name = name;
	}

	public void climbing() {
		System.out.println("猴子会爬树...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

// 接口
interface Fishable {
	public void swimming();
}

interface Birdable {
	public void flying();
}

// 继承类,实现接口
// 继承的价值主要在于:解决代码的复用性和可维护性
// 接口的价值主要在于:设计,设计好各种规范(方法),让其他类去实现这些方法,即更加的灵活.
// 接口比继承更加灵活
// 继承是满足 is-a的关系,而接口只需要满足like-a的关系
// 接口在一定程度上实现代码解耦
class LittleMonkey extends Monkey implements Fishable, Birdable {
	/* 通过继承类 自动继承得来Monkey的方法 */
	public LittleMonkey(String name) {
		super(name);
	}

	/* 通过重写两个方法实现flying和swimming的接口 */
	public void flying() {
		System.out.println(this.getName() + "努力学习会飞了...");
	}

	public void swimming() {
		System.out.println(this.getName() + "努力学习会游泳了...");
	}
}