package com.jl.try_;

import java.util.Scanner;

public class TryCatchExercise04 {
}

class Exception4 {

	/**
	 * 如果用户输入的不是一个整数,就提示他反复输入,直到输入一个整数为止.
	 */

	public static int method() {

		Scanner scanner = new Scanner(System.in);
		String scannerInt = scanner.next();
		try {
			int scannerInt1 = Integer.parseInt(scannerInt);
			return 2;
		} catch (NumberFormatException e) {
			return 1;
		}
	}

	public static void main(String[] args) {


		while (true) {

			System.out.println("请输入一个整数...\n");
			int n1 = method();
			if (n1 == 1) {
				System.out.println("用户输入错误,重新输入");
				System.out.println("===================");
			}
			if (n1 == 2) {
				System.out.println("用户输入为整数,退出...");
				break;
			}

		}

	}
}
