package com.jl.string_.stringbuffer_;

public class StringandStringBuffer {
	public static void main(String[] args) {
		//method1 此方法返回的才是String builder对象，对str本身没有影响
		String str = "hello tom";
		StringBuffer stringBuffer = new StringBuffer(str);

		//method2 append方法
		StringBuffer stringBuffer2 = new StringBuffer("韩顺平教育");
		stringBuffer2 = stringBuffer.append(str);

		//method3 toString()
		String s = stringBuffer2.toString();

		//使用构造器
		String s1 = new String(stringBuffer2);


	}
}
