package com.jl.interface_;

public class InterfaceDetail02 {
	public static void main(String[] args) {
		//证明接口中的属性都是 public static final修饰符
		//能够通过一个接口的名称直接去访问属性,就是static根本的用法
		System.out.println(IB.n1);      //7
		//IB.n1=30; //n1是一个final的不可以再次赋值.

	}
}
interface IB{
	/*protected\private都会直接报错,默认不写,删除实现接口中的类中的public会报错.*/
	int n1=100; //6
	void hi();
}
interface IC{
	void say();
}
//8
interface ID extends IB,IC{

}

//5.一个类可以同时实现多个接口
//6.接口中的属性只能是final的,而且是public static final修饰符,比如 int a=1 实际上是public static final int a=1;(必须初始化)
//7.接口中的属性访问方式 接口名.属性名
//8.接口不能继承其他的类,但是可以继承多个别的接口
//9.接口的修饰符只能是public 和默认,和类的修饰符是一样的.

interface IE{

}


//5
class Pig implements IB,IC/*,xxxx*/{
	@Override
	public void hi() {

	}

	@Override
	public void say() {

	}
}
