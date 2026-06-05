package com.jl.string_.stringbuffer_;

public class StringBufferMethod {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("hello");
		s.append(',');//hello,
		s.append("张三丰");//hello,张三丰
		s.append("赵敏").append(100).append(true).append(10.5);//hello,张三丰赵敏100true10.5
		System.out.println(s);//hello,张三丰赵敏100true10.5

		//delete
		s.delete(11, 14);//11~14的字符是1 0 0
		System.out.println(s);//hello,张三丰赵敏true10.5

		//edit
		s.replace(9, 11, "韩顺平");
		System.out.println(s);//hello,张三丰韩顺平true10.5  ，自动后移

		//find
		int indexOf = s.indexOf("张三丰");
		System.out.println(indexOf);//6

		//insert
		s.insert(9, "赵敏");
		System.out.println(s);//hello,张三丰赵敏韩顺平true10.5,原来为9的内容自动后移


		System.out.println(s.length());
	}
}
