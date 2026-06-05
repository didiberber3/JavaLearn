package com.jl.interface_;

public class InterfacePolyParameter {
	public static void main(String[] args) {
		//Interface poly 体现
		//接口类型的变量 if01 可以指向实现了IF接口的对象实例
		IF if01 = new Monster();
		if01 = new Car();
		//extends poly 的体现
		//父类类型变量if01 可以指向继承了AAA的子类的对象实例
		AAA a = new BBB();
		a = new CCC();
	}
}

interface IF {
}

class Monster implements IF {
}

class Car implements IF {
}

class AAA {

}

class BBB extends AAA {

}

class CCC extends AAA {

}