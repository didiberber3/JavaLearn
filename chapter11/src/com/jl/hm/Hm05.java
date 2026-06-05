package com.jl.hm;

public class Hm05 {
	public static void main(String[] args) {

		new A().f1();
	}
}

//1. 编一个类A，在类中定义局部内部类B，B中有一个私有常量name，有一个方法show()打印常量name。进行测试
class A {
	//2. 进阶：A中也定义一个私有的变量name，在show方法中打印测试
	private final String NAME = "++";

	//此处改正,局部内部类在方法内和代码块内而不是成员内部类的位置
	public void f1() {
		class B {
			private final String NAME = "XiaoQi";

			public void show() {
				System.out.println("内部类B的NAME为 " + NAME + " (\"NAME\")");
				System.out.println("外部类B的NAME为 " + A.this.NAME + " (\"A.this.NAME\")");
			}
		}
		new B().show();
	}
}
