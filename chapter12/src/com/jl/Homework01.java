package com.jl;

public class Homework01 {
	public static void main(String[] args) {

		//B C D
		try {
			func(); //抛出异常后 代码不再执行
			System.out.println("A");
		} catch (Exception e) { //捕获异常,输出CD
			System.out.println("C");
			System.out.println("D");
		}
	}

	public static void func() {
		try {
			throw new RuntimeException();   //抛出运行时异常
		} finally {
			System.out.println("B");    //finally一定会执行
		}
	}
}



