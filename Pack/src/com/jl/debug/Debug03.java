package com.jl.debug;

import java.util.Arrays;

public class Debug03 {
	public static void main(String[] args) {
		// debug 源码
		int[] arr = {8, -1, 199, 70, 10};
		// 排序，追入 Arrays.sort() 的源码 -> debug

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}

