package com.jl.super_;

public class B extends A {
	int n1 = 888;
	public void test() {
		System.out.println("super.n1=" + super.n1);
	}

	//访问父类的属性，但是不能访问父类的private属性
	public void hi() {                                            //私有的访问权限
		System.out.println(super.n1 + super.n2 + super.n3 /* + super.n4 */);
	}

	public void cal() {
		System.out.println("B类中的cal()方法");
	}

	//访问父类的方法，但是不能访问父类的private方法
	public void ok() {
		super.test100();
		super.test200();
		super.test300();
		//私有方法
		//super.test400();

	}

	//访问父类的构造器，super(参数列表);只能放在构造器的第一句,只能出现一句
	public B() {
		//super();    //调用无参构造器
		//super("jackie");    //调用三个参数的构造器
		super("jackie", 10);    //调用两个参数的构造器

	}

	public void sum() {
		System.out.println("B类的sum方法");
		//希望调用A类的cal方法
		//因为B类中没有cal方法,可以使用以下三种方式调用A类中的cal
		//找cal方法时的顺序是先找本类,本类没有找父类,父类没有继续循环,一直找到cal方法,
		//找到后就调用并且使用

		//1.
		//cal();


		this.cal();  //等价于cal();

		//3.
		//super.cal();  //直接跳过本类,从父类开始查找.
		//演示访问属性的规则
		System.out.println("自动查找n1 " + n1);
		System.out.println("本类的n1 " + this.n1);
		System.out.println("父类的n2 " + super.n1);
	}

}
