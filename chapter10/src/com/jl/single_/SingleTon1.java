package com.jl.single_;

public class SingleTon1 {

	public static void main(String[] args) {
		//将构造器私有化后，不能直接创建新建对象。
//		Girlfriend jackie = new Girlfriend("Jackie");
//		Girlfriend jackie1 = new Girlfriend("Jackie1");

		//通过方法获取对象.
		Girlfriend instance = Girlfriend.getInstance();
		System.out.println(instance);
		Girlfriend instance2 = Girlfriend.getInstance();
		System.out.println(instance2);
		System.out.println(instance == instance2);//T
		System.out.println(Girlfriend.n1);//100


	}

}


//单例模式-饿汉式
//饿了马上就要吃，类中已经定义好了面包，开袋（getInstance）即时

//有一个类，Girlfriend
//只能有一个女朋友，
class Girlfriend {
	private String name;

	public static int n1 = 100;

	//这种对象通常都是重量级的对象，饿汉式存在 创建了没有用 造成资源的浪费
	//2. 在类中直接创建对象。
	//为了能够在静态方法中,提供一个公共方法，返回gf对象,需要将其修饰为static
	private static Girlfriend gf = new Girlfriend("jackie");

	//3. 提供一个公共的static方法，返回gf对象

	public static Girlfriend getInstance() {
		return gf;

	}
	//1. 将构造器私有化。

	private Girlfriend(String name) {
		System.out.println("构造器被调用");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Girlfriend{" +
				"name='" + name + '\'' +
				'}';
	}
}