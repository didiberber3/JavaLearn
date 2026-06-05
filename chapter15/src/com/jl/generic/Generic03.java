package com.jl.generic;

public class Generic03 {
	public static void main(String[] args) {

		Person<String> stringPerson = new Person<String>("person1");
		/*
		上面的Person类
		将E的了类型指定为String
		所有的E都会改为String
		* */

	}
}

//泛型的作用是，可以在类声明时，1. 通过一个标识表示类中某个属性的类型。
//或者是某个方法的返回值的类型，或者是参数类型
//（E就是任何类型）
class Person<E> {
	//  通过一个标识表示类中某个属性的类型。
	//	E表示s的数据类型，该数据类型在定义Person类的时候指定，
	//	即在编译期间就已经确定E是什么类型
	E s;

	//或者是参数类型
	public Person(E s) {
		this.s = s;
	}

	//某个方法的返回值的类型
	public E f() {
		return s;
	}

}