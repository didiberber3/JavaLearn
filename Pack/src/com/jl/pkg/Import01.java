package com.jl.pkg;

import java.util.*;//表示全部引入
//建议需要使用到哪个类就导入哪个类即可，不建议使用*导入
//import java.util.Scanner;//表示只会引入java.util包下的Scanner

public class Import01 {
	public static void main(String[] args) {
		//使用系统提供的Arrays完成数组排序
		int[] arr = {-1, 5, 3, 4, 8};
		//对其排序
		//传统方式是自己编写排序
		Arrays.sort(arr);//包中的排序
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
