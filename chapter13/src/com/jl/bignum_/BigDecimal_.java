package com.jl.bignum_;

import java.math.BigDecimal;

public class BigDecimal_ {
	public static void main(String[] args) {
		BigDecimal bigDecimal = new BigDecimal("0.1234134241234231143214324231");
		BigDecimal bigDecimal1 = new BigDecimal("1.1243214324231");
		System.out.println(bigDecimal);
		//对BigDecimal进行运算 也要使用专用的方法
		System.out.println(bigDecimal.add(bigDecimal1));
		System.out.println(bigDecimal.subtract(bigDecimal1));
		System.out.println(bigDecimal.multiply(bigDecimal1));

		// divide*可能* 会抛出异常：进行除法时可能除不尽ArithmeticException
		// 设置精度避免这种情况：
		// eg: BigDecimal.ROUND_CEILING 如无限循环小数 就会保留分子的精度
		System.out.println(bigDecimal.divide(bigDecimal1, BigDecimal.ROUND_CEILING));
	}
}
