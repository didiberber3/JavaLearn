package com.jl.innerclass_;

public class AnonymousInnerClassDetail {
	public static void main(String[] args) {

		Outer05 outer05 = new Outer05();
		outer05.f1();
	}
}

class Outer05 {
	private int n1 = 99;

	public void f1() {
		//创建一个基于类的匿名内部类
		//不能添加访问修饰符
		Person p = new Person() {
			private int n1=10;
			@Override
			public void hi() {
				//可以直接访问外部类的所有成员,包含私有的
				System.out.println("匿名内部类Override了hi(),n1=" + n1 +
						"外部类的n1=" + Outer05.this.n1);
			}
		};
		p.hi(); //动态绑定就近原则编译类型是Outer05,运行类型是Outer05$1

//		//也可以直接调用
//		new Person() {
//			@Override
//			public void hi() {
//				System.out.println("匿名内部类Override了hi(),并且没有创建对象接收");
//			}
//
//			@Override
//			public void ok(String str) {
//				super.ok(str);
//			}
//		}.ok("jackieStr");
	}
}

class Person {
	public void hi() {
		System.out.println("Person.hi()");
	}

	public void ok(String str) {
		System.out.println("Person.ok()" + str);
	}
}

//抽象类/接口...