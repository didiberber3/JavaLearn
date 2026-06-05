package com.jl.abstract_;

public class Abstract01 {
	public static void main(String[] args) {

	}
}

abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	/*思考:这里是eat 实现了,但其实没有什么意义*/
	//即: 父类方法的不确定性 问题
	//>>> 考虑将方法设计为抽象(abstract)方法
	//>>> 所谓抽象方法就是没有实现的方法
	//>>> 所谓的没有实现,就是指没有方法体
	//>>> 当一个类中存在抽象方法时,需要将该类声明为abstract类
//	public void eat() {
//		System.out.println("这是一个动物,但是不知道吃什么");
//	}
	public abstract void eat();


}





