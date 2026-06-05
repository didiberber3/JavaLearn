package com.jl.Object_;

public class EqualsExercise03 {

	public static void main(String[] args) {
		int it = 65;
		float fl = 65.0f;
		System.out.println("65和65.0f是否相等?" + (it == fl)); // 输出: true，因为65和65.0在数值上相等

		char ch1 = 'A'; // 'A' 的ASCII值为65
		char ch2 = 12;  // 12 是ASCII字符（换页符）
		System.out.println("65和'A'是否相等?" + (it == ch1)); // 输出: true    因为ascII相等
		System.out.println("12和ch2是否相等?" + (12 == ch2)); // 输出: true    值相等

		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("str1和str2是否相等?" + (str1 == str2)); // 输出: false，因为==比较引用地址
		System.out.println("str1是否equals str2?" + (str1.equals(str2))); // 输出: true，因为equals比较内容

		// 比较字符串字面量和Date对象：总是false，因为类型不同且引用地址不同
		//System.out.println("hello" == new Date(System.currentTimeMillis())); //输出:false 编译错误
	}
}


