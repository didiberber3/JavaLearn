package com.jl.hm_;

import javax.swing.*;

public class Hm03 {
	public static void main(String[] args) {
		//编写java程序，输入形式为 Liu Li Jia 的人名，以 Jia,Liu .L 的形式打印。
		// 其中.L是中间单词的首字母
		//验证"Captain Donk Simple"
		String name = "Captain Donk Simple";
		//split按空格" " 将Liu Li Jia分成数组中的三个元素,
		String[] split = name.split(" ");

		//这是中间的单词
		System.out.println(split[1]);
		//这是中间单词的首字母
		System.out.println(split[1].charAt(0));

		System.out.println(split[0] + "," + split[2] + " ." + split[1].charAt(0));


	}
}
