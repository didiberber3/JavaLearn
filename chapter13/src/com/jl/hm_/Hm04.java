package com.jl.hm_;

import javax.swing.*;

public class Hm04 {
	public static void main(String[] args) {

		//输入字符串,判断里面有多少个大写字母,多少个小写字母,多少个数字
		String str = "L2JsdL";      // 3个大写 2个小写 1个数
		String[] split = str.split("");

		int upperCount = 0;//大写数字
		int lowerCount = 0;//小写数字
		int digitCount = 0;//数字


		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				upperCount++;
			} else if (Character.isLowerCase(c)) {
				lowerCount++;
			} else if (Character.isDigit(c)) {
				digitCount++;
			}
		}
		System.out.println("大写" + upperCount + "个");
		System.out.println("小写" + lowerCount + "个");
		System.out.println("数字" + digitCount + "个");
	}

}
