package com.jl.exception_;

public class Exception01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
//		抛出异常：ArithmeticException
//		当程序异常后程序崩溃，退出，下面的代码不再执行。
//		这样的程序不合理。这是致命的问题，会导致整个系统崩溃
//		异常处理机制 处理该问题
//      选中后 Ctrl Alt T ，第六项
//		如果进行异常处理，那么即使出现了异常也能正常运行
		try {
			int res = num1 / num2;
		} catch (Exception e) {
			//输出异常信息。
			System.out.println("出现异常的原因: "+e.getMessage());
		}
//		如果程序员认为一段代码可能出现异常/问题，可以使用try-catch异常处理机制来解决
//		从而保证程序的健壮性
		System.out.println("程序继续运行");
	}
}
