package com.jl.abstract_;

public class AbstractDetail02 {
	public static void main(String[] args) {
	}
}

abstract class E {
	public abstract void hi();
}

//如果类要继承抽象类,则需要将子类声明为abstract类
abstract class EE extends E {
}

//或者实现抽象类的所有抽象方法
class GG extends E {
	@Override
	//这里相当于GG子类实现了父类E的抽象方法,所谓实现方法就是有方法体
	public void hi() {
	}
}

//抽象类的本质还是类,所以可以有类的各种成员.
abstract class AA {
	public int n1 = 10;
	public static String name = "666";

	public void hi() {
		System.out.println("hi");
	}

	public abstract void hello();

	public static void say() {
	}
}

//抽象方法不能使用static(一开始就定好) private(不能被读写) final(已经是最终形态) 来修饰,因为与 重写 相违背.
abstract class H {
	public abstract void hi();//抽象方法
}