package com.jl.generic.customgeneric;

public class CustomGeneric_ {
	public static void main(String[] args) {

		Tiger<Double,String,Integer> g = new Tiger<>("john");
		g.setT(2000.12);


	}
}

// 把Tiger当做泛型类,泛型一般标识符为 单个大写 Single Upper Letter
class Tiger<T, R, V> {

	String name;
	R r;
	T t;
	V v;

	//  不知道开辟多大空间,没有规定类型,所以不能初始化
	//	T [] ts = new T[8];
	// 	"Type parameter 'T' cannot be instantiated directly"




	// 类的加载在前面,在类加载的时候 没有定义泛型,static 不知道R是什么类型. 顺序问题
	//	public static void m1(R r) {}
	// 'com.jl.generic.customgeneric.Tiger.this' cannot be referenced from a static context


	public Tiger(String name) {
		this.name = name;
	}

	public Tiger(R r, T t, V v) {
		this.r = r;
		this.t = t;
		this.v = v;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public R getR() {
		return r;
	}

	public void setR(R r) {
		this.r = r;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
}