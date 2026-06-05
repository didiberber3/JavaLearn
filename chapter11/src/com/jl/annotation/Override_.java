package com.jl.annotation;

public class Override_ {
	public static void main(String[] args) {

	}
}

class Father {
	public void fly() {
		System.out.println("Father Fly...");
	}
}

class Son extends Father {
	// 写上@Override的价值就在于:
	// 1. 编译器就回去检查该方法是否真的重写了父类的某个方法
	// 2. 如果的确重写了就通过,如果没有构成重写则编译错误

	/*
		 @interface 不是interface,是jdk5.0之后加进去的.
		 @Target(ElementType.METHOD)
		 @Retention(RetentionPolicy.SOURCE)
		 public @interface Override {
		 }
	 */
	//如果发现了@interface 就表示一个注解类
	@Override
	public void fly() {
		System.out.println("Son Fly...");
	}
}