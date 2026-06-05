package com.jl.debug;

public class Debug01 {
	//演示逐行执行
	public static void main(String[] args) {

		int res = 0;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += i;
			System.out.println("i=" + i);
			System.out.println("sum=" + sum);

		}
		System.out.println("结束循环");
	}

}
