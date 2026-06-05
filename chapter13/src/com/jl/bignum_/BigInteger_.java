package com.jl.bignum_;

import java.math.BigInteger;

public class BigInteger_ {
	public static void main(String[] args) {
		long l = 1231239713;
		System.out.println("l=" + l);
		BigInteger bigInteger = new BigInteger("1203981203889");
		BigInteger bigInteger1 = new BigInteger("1212303981203889");
		System.out.println(bigInteger);
		//在对biginteger进行运算的时候需要
		BigInteger add = bigInteger1.add(bigInteger1);
		System.out.println(add);
		BigInteger sub = bigInteger1.subtract(bigInteger1);
		System.out.println(sub);
		BigInteger mul = bigInteger1.multiply(bigInteger1);
		System.out.println(mul);
		BigInteger div = bigInteger1.divide(bigInteger1);
		System.out.println(div);
	}
}
