package com.jl.string_.stringbuffer_;

public class StringBuffer02 {
	public static void main(String[] args) {
		//char[16]
		StringBuffer stringBuffer = new StringBuffer();
		//char[18] capacity 容量 容积
		StringBuffer stringBuffer1 = new StringBuffer(18);
		//char[stringBuffer2.length+16] value=h e l l o
		StringBuffer stringBuffer2 = new StringBuffer("hello");

		System.out.println(stringBuffer);

	}
}
