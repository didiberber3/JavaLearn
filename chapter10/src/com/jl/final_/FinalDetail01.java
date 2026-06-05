package com.jl.final_;

public class FinalDetail01 {
	public static void main(String[] args) {

	}
}

class AA {
	/*
	1. 定义时 ：	public final double NUM = 0.01;
	2. 在构造器中
	3. 在代码中

	*/
	public final double TAX_RATE1 = 0.01;   //定义时
	public final double TAX_RATE2;
	public final double TAX_RATE3;

	public AA() {
		TAX_RATE2 = 1.1;    //构造器中
	}

	{
		TAX_RATE3 = 0.01;   //代码块中
	}
}

class BB {
	//		4. 如果final修饰的属性是静态的，则只能在 1 2 声明
//		1. 定义时
//		2. 静态代码块中
//		3. 不能在静态构造器中赋值
	public static final double TAX_RATE1 = 0.01;    //定义时


	public static final double TAX_RATE2;

	static {
		TAX_RATE2 = 0.1;    //静态代码块中
	}

	public BB() {
//		TAX_RATE3 = 9.9;    //不能在静态构造器中赋值
	}
}

//final类是不能继承，但可以创建对象实例。
final class CC {
}

//如果类不是final类 但是含有final方法,则该方法虽然不能被重写,但是可以被继承.
class DD {
	public final void cal() {
		System.out.println("cal()方法");
	}
}

class EE extends DD {
	public final void calling() {
		cal();  //可以被继承.
	}
}