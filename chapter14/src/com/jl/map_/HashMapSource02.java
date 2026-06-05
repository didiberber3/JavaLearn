package com.jl.map_;

import java.util.HashMap;
import java.util.Objects;

public class HashMapSource02 {
	public static void main(String[] args) {

		HashMap hashMap = new HashMap();

		for (int i = 0; i <= 12; i++) {

			hashMap.put(new A(i), "hello");

		}

		System.out.println(hashMap);
//		布置任务：设计代码，验证table的扩容机制。
//		（0 -> 16（12）-> 32（24）-> 64（48）-> 96(96*0.75)）(0.75 加载因子

	}
}

class A {
	private int num;

	public A(int num) {
		this.num = num;
	}

	@Override
	public int hashCode() {
		return 100;
	}

	@Override
	public String toString() {
		return "A{" +
				"num=" + num +
				'}';
	}
}