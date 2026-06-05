package com.jl.static_;

public class ChildGame {
	public static void main(String[] args) {

		//定义一个变量,统计有多少个小孩儿加入游戏;


		Child child = new Child("白骨精");
		child.join();
		child.count++;
		Child child1 = new Child("狐狸精");
		child1.join();
		child1.count++;

		Child child2 = new Child("老鼠精");
		child2.join();
		child2.count++;


		//类变量可以通过类名来访问
		//Clas variable can be used by Class name
		System.out.println("共有" + Child.count + "个小孩儿加入了游戏");
		System.out.println(child.count);
		System.out.println(child1.count);
		System.out.println(child2.count);
	}
}

class Child {
	private String name;
	//define variable count, which is a static variable
	public static int count = 0;

	public Child(String name) {
		this.name = name;
	}

	public void join() {
		System.out.println("小孩儿加入了游戏...");
	}
}