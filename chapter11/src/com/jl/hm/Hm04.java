package com.jl.hm;

public class Hm04 {
	public static void main(String[] args) {
		//2. 要求调用CellPhone对象的testWork方法，使用上匿名内部类。
		Cellphone cellphone = new Cellphone();

		//通过匿名内部类和动态绑定 直接在方法重写中完成计算器功能
		//写成加法
		cellphone.testWork(new PC() {
			@Override
			public double work(double num1, double num2) {
				return num1 + num2;
			}
		}, 10, 8);

		//写成减法
		cellphone.testWork(new PC() {
			@Override
			public double work(double num1, double num2) {
				return num1 - num2;
			}
		}, 33.2, 111);

		//写成乘法
		cellphone.testWork(new PC() {
			@Override
			public double work(double num1, double num2) {
				return num1 * num2;
			}
		}, 2, 3);

		//除法
		cellphone.testWork(new PC() {
			@Override
			public double work(double num1, double num2) {
				return num1 / num2;
			}
		}, 3, 3);


	}
}

//1. 计算器接口具有work方法，功能是运算，有一个手机类Cellphone，定义方法testWork测试计算功能，调用计算接口的work方法；
interface PC {
	double work(double num1, double num2);

}

class Cellphone {
	public void testWork(PC pc, double num1, double num2) {
		double result = pc.work(num1, num2);
		System.out.println("运算结果是: " + result);
	}


}


