package com.jl.arrays_;

import java.util.Arrays;
import java.util.List;

public class ArraysBinarySearch {
	public static void main(String[] args) {
		Integer[] arr = {1, 2, 555, 9999};
//		1. binarySearch 二叉查找
		int index = Arrays.binarySearch(arr, 1);
		System.out.println(index);// 0  是其索引位置
		int index1 = Arrays.binarySearch(arr, -1);
		System.out.println(index1);//-1 没有找到
		Integer[] arr1 = {1, 222, 13, 8888, 9999};
		int index2 = Arrays.binarySearch(arr, -13);
		System.out.println(index2);//其会标记如果存在,会在索引的第几个位置,然后取相反数,也就是-1
		int index3 = Arrays.binarySearch(arr, 9990);
		System.out.println(index3);//其会标记如果存在,会在索引的第几个位置,然后取相反数,也就是-4


//		2. copyOf 数组元素的赋值

		//从arr这个数组中,拷贝arr.length个数组到newArr中
		Integer[] newArr = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(newArr));
		//如果是arr.length-1 就少一个元素
		Integer[] newArr1 = Arrays.copyOf(arr, arr.length - 1);
		System.out.println(Arrays.toString(newArr1));

		//如果是arr.length+1 就多一个元素空间,值为null
		Integer[] newArr2 = Arrays.copyOf(arr, arr.length + 1);
		System.out.println(Arrays.toString(newArr2));
		//如果拷贝长度小于0,则抛出异常.
//		Integer[] newArr3 = Arrays.copyOf(arr, -1);//抛出数组尺寸异常
//		System.out.println(Arrays.toString(newArr3));


//		fill 数组元素的填充
//		替换原来的元素
		Integer[] num = new Integer[]{9, 3, 2};
		Arrays.fill(num, 99);
		System.out.println("填充后的数组num=" + Arrays.toString(num));


//		equals 比较两个数组的元素是否完全一致
		Integer[] num1 = new Integer[]{99, 99, 99};
		System.out.println(Arrays.equals(num, num1));//true
		Integer[] num2 = new Integer[]{99, 99, 991};
		System.out.println(Arrays.equals(num, num2));//false


//		asList 将一组值,转换成List
//		asList()会将数据转换成一个List集合
		List asList = Arrays.asList(2, 3, 4, 5, 6, 7, 78, 3, 563, 456, 2345, 4235);
		System.out.println("asList=" + asList);
		System.out.println("asList的运行类型" + asList.getClass());
		//class java.util.Arrays$ArrayList
	}
}
