package com.jl;

public class EcmDef {
	//编写应用程序EcmDef.java，接收命令行的两个参数(整数)，计算两数相除,
	// 计算两个数相除， 要求使用方法 cal(int n1,int n2)
	// 对数据格式不正确、缺少命令行参数、除0 进行异常处理。
	public static void main(String[] args) {

		//args是一个接收命令行参数的数组, 需要Edit Configurations
		//通过传入参数识别不同异常
		System.out.println("请分别输入两个整数...\n");
		if (args.length != 2) {
			throw new ArrayIndexOutOfBoundsException("参数个数异常");
		}
		try {
			int input1 = Integer.parseInt(args[0]);
			int input2 = Integer.parseInt(args[1]);
			double res = cal(input1, input2);
			// NumberFormatException 数据格式异常
			// ArrayIndexOutOfBoundsException
			// ArithmeticException
			System.out.println("计算结果是: " + res);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("数据格式异常");
		} catch (ArithmeticException e) {
			System.out.println("除0异常");
		}
	}
	public static int cal(int n1, int n2) {
		return n1 / n2;
	}
}
