package com.jl.final_;

public class FinalExercise01 {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		System.out.println(circle.area());
	}
}

class Circle {
	private double radius;
	private final double PI = 3.14;    //1

	//构造器
	public Circle(double radius) {
		this.radius = radius;
//		PI = 3.14;  //2
	}

	{
//		PI = 3.14;    //3
	}

	public double area() {
		return PI * radius * radius;
	}

}