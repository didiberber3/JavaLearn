package com.jl.extend_;

//继承的本质
public class ExtendsTheory {
	public static void main(String[] args) {
		Son son = new Son();//内存的布局

		/* 首先 子类中是否有该属性
		 * 1)如果子类有这个属性，并且可以访问，则返回信息
		 * 2)如果没有，就向上查找，就看父类有没有这个属性，
		 * 3)如果父类有这个属性，并且可以访问，则返回信息
		 * 4)如果父类也没有，按照3的规则继续找上级
		 */
		System.out.println(son.name);       //返回小脑儿子
		System.out.println(son.getAge());        //返回大头爸爸
		System.out.println(son.hobby);      //返回巨头爷爷
	}
}

class Grandpa { //爷爷类
	String name = "巨头爷爷";
	String hobby = "trip";

}

class Father extends Grandpa {  //子类继承grandpa
	String name = "大头爸爸";
	private int age = 39;

	public int getAge() {
		return age;
	}
}

class Son extends Father {  //子类继承father
	String name = "小脑儿子";

}