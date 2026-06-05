package com.jl.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDetails {
	public static void main(String[] args) {

		ArrayList<Integer> integers = new ArrayList<>();//OK
//		ArrayList<int> ints = new ArrayList<int>();
//      不行，泛型需要使用引用类型不能是基本数据类型


		//指定A作为泛型,Pig类中的E泛型也被指定为A，Pig类中的e属性也被泛型指定为A
		Pig<A> aPig = new Pig<A>(new A());
		aPig.f();
//		除非 B继承A B自然继承了A的所有泛型，其在创建A泛型时也可以添加B对象
		Pig<A> aPig2 = new Pig<A>(new B());
		aPig2.f();

//		泛型的使用形式
		ArrayList<Integer> integers1 = new ArrayList<>();
		List<Integer> integers2 = new ArrayList<Integer>();
//		实际开发中，通常使用简写，其运行类型会推断
		List<Integer> integers3 = new ArrayList<>();

		//		<>默认泛型是Object
		ArrayList arrayList = new ArrayList();
//		等价于
//		ArrayList<Object> arrayList = new ArrayList<>();


		Tiger objectTiger = new Tiger();
	}
}

class Tiger<E> {
	E e;

	public Tiger() {
	}

	public Tiger(E e) {
		this.e = e;
	}
}

class A {
}

class B extends A {
}

class Pig<E> {
	E e;

	public Pig(E e) {
		this.e = e;
	}

	public void f() {
		System.out.println(e);
	}
}
