package com.jl.override_;

public class Dog extends Animal {

	//因为dog是animal子类
	//Dog的cry方法和Animal的cry方法的定义形式一样:名称cry 返回类型void 参数
	//这时是Dog的方法重写了Animal
	public void cry() {
		System.out.println("小琪汪汪");
	}

	public String m1() {
		return null;
	}

//	    Object不是String的子类,所以报错

//	public Object m2() {
//		return null;
//	}

	//此处不可以写String因为String不是BBB的子类
	public BBB m3() {
		return null;
	}


	/*访问范围:
	public > protected > 默认 > private */
	public void eat() {

	}
}

class AAA {

}

class BBB extends AAA {

}

