package com.jl.debug;

import java.util.Arrays;

public class Debug04 {

	public static void main(String[] args) {
		// debug 源码
		int arr[] = {8, -1, 199, 70, 10};
		// 排序，追入 sort 的源码
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
		System.out.println("hello100");
		System.out.println("hello200");
		System.out.println("hello300");
		System.out.println("hello400");
		System.out.println("hello500");
		System.out.println("hello600");
		System.out.println("hello700");
	}
}

