package com.jl.Object_;

//finalize的使用
public class Finalize {
	public static void main(String[] args) {
		Car tlj = new Car("拖拉机");
		tlj = null;//这时这个car对象 已经置成垃圾(null)了,垃圾回收器会进行垃圾回收
		//在销毁对象前,会调用finalize()
		//程序员就可以在finalize中写自己的业务逻辑,(比如释放资源, 数据库链接, 打开文件...)
		//如果不重写,就会调用object类的finalize()方法
		System.out.println("程序退出了...");
	}
}

class Car {
	String name;

	public Car(String name) {
		this.name = name;
	}//重写finalize

	@Override
	protected void finalize() throws Throwable {
		System.out.println("我们销毁了 汽车" + name);
		System.out.println("我们释放了某些资源...");
	}
}