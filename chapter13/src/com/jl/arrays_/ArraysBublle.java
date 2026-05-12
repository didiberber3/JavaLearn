package com.jl.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysBublle {
	public static void main(String[] args) {
		int[] arr = {1, 7, 16, 2346, 234, 123132};

//		bubble01(arr);
		bubble02(arr, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {

				int i1 = (Integer) o1;
				int i2 = (Integer) o2;
				return i1 - i2;
//				return i2 - i1;
			}
		});
		System.out.println();
		System.out.println(Arrays.toString(arr));

	}

	//bubble 冒泡排序
	public static void bubble01(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {  //遍历
			for (int j = 0; j < arr.length - 1 - i; j++) {

				//判断 交换
				//从小到大
				if (arr[j] > arr[i]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
	}

	//结合冒泡+定制
	public static void bubble02(int[] arr, Comparator c) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {  //遍历
			for (int j = 0; j < arr.length - 1 - i; j++) {

				//数组排序由 c.compare(arr[j], arr[j + 1]决定
				if (c.compare(arr[j], arr[j + 1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
	}
}

