package com.jl.string_.stringbuffer_;

public class StringBufferExercise01 {
	public static void main(String[] args) {
		String str = null;
		StringBuffer sb = new StringBuffer();
		sb.append(str);//将空的sb扩展处一个str字符串，str字符串中有四个字符，所有0+4=4
		System.out.println(sb.length());//4

		System.out.println(sb);//null
		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1);//Empty


	}
}
