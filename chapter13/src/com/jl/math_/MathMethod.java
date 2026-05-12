package com.jl.math_;

public class MathMethod {
	public static void main(String[] args) {
//		Math 常用的方法

//		1. abs看绝对值

		int abs = Math.abs(9);
		System.out.println(abs);//9

		int abs1 = Math.abs(-99);
		System.out.println(abs1);//99

//		2. pow 求幂
		double pow = Math.pow(-3.5, 4);
		System.out.println(pow);//-3.5的四次幂

//		3. ceil 向上取整,返 >=该参数的最小整数
		double ceil = Math.ceil(-3.0001);
		System.out.println(ceil);//-3.0

//		4. floor 向下取整，返回 <=改参数的最大整数
		double floor = Math.ceil(-4.999);
		System.out.println(floor);//-4.0

//		5. round 四舍五入, Math.floor(该参数+0.5)
		double round = Math.round(-5.0001);
		System.out.println(round);//-5.0

//		6. sqrt 求开方
		double sqrt = Math.sqrt(9.0);
		System.out.println(sqrt);//3.0

//		7. random 随机数 返回的是 0 <= x < 1 之间的随机数,加上两个参数可以修改0 1
		for (int i = 0; i < 10; i++) {
			System.out.println((int) (2 + Math.random() * (7 - 2 + 1)));
//										范围是a~b，公式就为 a ,a+b-1;
		}
		System.out.println();

//		8. max 返回最大值
		int max = Math.max(1, 9);
		System.out.println(max);

//		8. min 返回最小值
		int min = Math.min(1, 9);
		System.out.println(min);


	}
}
