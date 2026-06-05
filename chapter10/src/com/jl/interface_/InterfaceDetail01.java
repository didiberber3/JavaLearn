package com.jl.interface_;

public class InterfaceDetail01 {
	public static void main(String[] args) {
//		new IA();
		//1
	}
}

//1. 接口不可以实例化
//2. 接口中的所有方法是public方法,接口中抽象方法可以不用abstract修饰
//3. 一个普通类实现接口 就必须将该接口的所有方法都实现,可以使用alt shift enter来解决
//4. 抽象类去实现接口时 可以不实现接口的抽象方法

interface IA {
	//2
	/*public*/ /*(abstract)*/
	// 修饰符有public protected private 默认,
	// 这里不是默认,因为去掉了使用接口的类中的public,会报错,
	// 由此可证明接口中的修饰符并非默认不写,而是public隐藏
	void say();
	void hi();
}

//Class 'Cat' must either be declared abstract or implement abstract method 'say()' in 'IA'
//3
class Cat implements IA {

	@Override
	public void say() {

	}

	@Override
	public void hi() {

	}
}
//4
abstract class Tiger implements IA{

}