package com.jl.string_.stringbuffer_;

public class StringBufferExercise02 {
	public static void main(String[] args) {
		/*
		输入商品名称和商品价格，要求打印效果示例，使用前面学习的方法完成
		商品名 商品价格
		手机 123,456.59
		要求 价格的小数点前面每三位用逗号隔开再输出

		 */

		/*
		定义一个Scanner 接受用户输入的价格(String)
		使用到StringBuffer的insert 需要将String转成StringBuffer
		 */

		//写程序，要考虑MVP 然后再优化
		String price = "968698698123456.68";
		StringBuffer sb = new StringBuffer(price);

		//find 这个小数点的索引 然后在该位置的前三位insert一个, 即可

		for (int j = sb.lastIndexOf(".") - 3; j > 0; j -= 3) {
			sb.insert(j, ",");
		}
		System.out.println(sb);
	}
}
