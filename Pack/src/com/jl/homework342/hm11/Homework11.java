package com.jl.homework342.hm11;

public class Homework11 {
	public static void main(String[] args) {
		Person p = new Student();        //父类对象使用子类就是向上转型
		p.run();    //运行的时候使用子类的方法
		p.eat();
		//p.study(); //这个方法不能写

		System.out.println();
		//向下转型,把指向子类对象的父类引用,转成子类对象的子类引用
		Student s = (Student) p;
		s.run();
		s.eat();
		s.study();


	}
}
