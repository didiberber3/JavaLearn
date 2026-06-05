package com.jl.single_;


/*懒汉式的单例模式*/
public class SingleTon2 {
	public static void main(String[] args) {

		Cat instance = Cat.getInstance();
		System.out.println(instance);

		//再次调用instance
		Cat instance2 = Cat.getInstance();
		System.out.println(instance2);

		System.out.println(instance == instance2);


	}
}

//希望程序在运行过程中只能创建一个Cat对象。
//使用单例模式。
class Cat {

	private String name;
	public static int n1 = 999;
	private static Cat cat;

	//仍然将构造器私有化
	//定以一个static静态属性对象
	//3.提供一个public的static方法，可以返回一个Cat对象。
	private Cat(String name) {
		this.name = name;
		System.out.println("构造器被调用");
	}

	public static Cat getInstance() {
		if (cat == null) {
			cat = new Cat("cutie");
		}
		return cat;
	}

	@Override
	public String toString() {
		return "Girlfriend{" +
				"name='" + name + '\'' +
				'}';
	}

}