package com.jl.string_.stringbuffer_;

public class StringBuffer01 {
	public static void main(String[] args) {
		//buffer 缓冲区
		// StringBuffer的直接父类是AbstractStringBuilder
		// StringBuffer实现了Serializable接口 对象可以串行化
		// 在父类中 AbstractStringBuilder 有属性 char[] value 不是final 该value数组存放字符串内容，引出存放在堆中的
		// StringBuffer是一个final类 不能被继承
		// 因为SB的字符内容是存在char[] value中的，所以在变化时不用每次都更换地址（创建新的对象）
		// 所以效率高于String
		StringBuffer stringBuffer = new StringBuffer();

	}
}
