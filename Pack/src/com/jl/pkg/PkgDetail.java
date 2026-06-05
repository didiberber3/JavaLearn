//要在第一行，一个类最多只有一个package
package com.jl.pkg;

//import指令 位置放在package的下面，在类定义前面,可以有多句且没有顺序要求

import java.util.Arrays;
import java.util.Scanner;

public class PkgDetail {
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		int[] arr = {0, -1, 1};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
