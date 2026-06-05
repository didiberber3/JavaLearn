package com.jl.hm_;

public class Hm01 {
	public static void main(String[] args) {
//		1.将字符串中指定部分进行反转,如a bcde f反转为a edcb f
//		2.编写方法 public static String reverse(String str,int start,int end 搞定

//		把String转成char,因为char[]的元素是可以交换的.
		String str = "12345";
		System.out.println("交换前:" + str.toString());
		String finalstr;
		try {
			finalstr = reverse(str, -1, 4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("交换后:" + finalstr.toString());
	}

	public static String reverse(String str, int start, int end) {

		//对输入的参数做一个验证:
		//重要的编程思想
		//1. 写出正确的情况,然后取反
		//  :start>=0,end<=length
		if (!(str != null && start >= 0 && end <= str.length() - 1 && end > start)) {
			throw new RuntimeException("参数不正确!");

		}

		//交换函数核心部分
		char[] chars = str.toCharArray();
		char temp = ' '; //交换辅助变量
		for (int i = start, j = end; i < j; i++, j--) {

			temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;

		}
		return new String(chars);

	}
}

