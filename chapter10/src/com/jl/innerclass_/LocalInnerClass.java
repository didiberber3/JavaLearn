package com.jl.innerclass_;

/**
 * 演示 局部内部类 的使用
 */
public class LocalInnerClass {
	public static void main(String[] args) {
		Outer02 outer02 = new Outer02();
		outer02.m1();
		System.out.println("outer02的hashcode=" + outer02);

	}
}

class Outer02 {  //外部类
	private int n1 = 10;

	private void m2() {
		System.out.println("Outer02 m2()");
	}

	public void m1() {  //方法
		String name = "String name xxx";
		/*final*/
		class Inner02 { //此内部类在方法中,此类成为局部内部类(本质上仍然是一个类)    //因为是局部类,所以不能使用访问修饰符
			//1. 可以访问外部类的所有成员
			private int n1 = 800;

			public void f1() {
				//想访问外部类的成员,可以使用(Outer.this.成员)
				//Outer02.this 本质就是外部类的对象.即哪个对象调用了m1()那么,这个Outer02.this就指向那个对象
				System.out.println("n1=" + n1 + "\n外部类的n1=" + Outer02.this.n1); //局部内部类,可以访问外部类的所有成员    //一旦重名,就近原则.
				System.out.println("Outer02.this的hashcode=" + Outer02.this);
				m2();
			}
		}
		Inner02 inner02 = new Inner02();
		inner02.f1();
		class Inner03 extends Inner02 {  //其他局部内部类可以继承
		}
	}

	{   //代码块
		class Inner03 {
		}
	}
}