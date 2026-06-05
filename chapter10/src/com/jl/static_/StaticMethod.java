package com.jl.static_;

public class StaticMethod {
	public static void main(String[] args) {
		Stu stu = new Stu("Tom");
		stu.payFee(26500);

		Stu stu1 = new Stu("Rose");
		stu.payFee(1000);

		//输出当前收到的总学费
		Stu.showFee();

		// 9开方的结果是
		System.out.println(Math.sqrt(9));   //3
	}
}

class Stu {
	private String name;
	//定义一个类变量来累积学生的学费
	private static double fee = 0;

	public Stu(String name) {
		this.name = name;
	}

	//	当方法使用了static修饰后,该方法就是静态方法
//	静态方法就可以访问静态属性/静态变量
	public static void payFee(double fee) {
		Stu.fee += fee;//调用payFee方法的时候,会将传入参数fee累积到fee中
	}

	public static void showFee() {
		System.out.println("Final fee is " + Stu.fee);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}