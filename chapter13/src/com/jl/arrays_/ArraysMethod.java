package com.jl.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod {
	public static void main(String[] args) {

//		1 toString 返回数组的字符串形式
		Integer arr[] = {91, 1, 2, 3, 4, 5, 6, 7, 9};
		System.out.println(Arrays.toString(arr));

		//		2 sort 排序 自然排序和定制排序
//		通过sort排序后，会直接影响到实参arr1

//		1.1默认排序方法
		Integer arr1[] = {1, -1, 3, -2, 8, 61, 7};
		Arrays.sort(arr1);//排序
		System.out.println(Arrays.toString(arr1));//输出数组
//		1.2定制排序方法
//		sort是重载的，也可以通过传入一个接口 Comparator 实现定制排序
//		调用 定制排序 时,传入两个参数 1. 排序的数组arr 2. 实现了Comparator接口的匿名内部类,要求实现Compare()方法
		Arrays.sort(arr, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Integer i1 = (Integer) o1;
				Integer i2 = (Integer) o2;


				return i2 - i1; //从大到小
			}
		});
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Integer i1 = (Integer) o1;
				Integer i2 = (Integer) o2;


				return i1 - i2;//从小到大
			}
		});
		System.out.println(Arrays.toString(arr));
	}
}
