package com.jl.debug;

public class Debug02 {
	public static void main(String[] args) {
		int[] arr = {1, 10, -1};
		//遍历数组没有arr.length-1 length为3,下标为2,越界异常
		for (int i = 0; i <= arr.length /* -1 */; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("退出for循环");
	}
}
