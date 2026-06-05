package com.jl.string_;

public class String01 {

	public static void main(String[] args) {
		//String用于保存字符串，也就是一组字符序列
		//jack是字符串常量
		//字符串使用Unicode编码，一个字符两个字节，
		//String类有很多的构造器，实现构造器的重载
		//常用的有
		// String s1= new String();
		// String s2= new String(String original);
		// String s3= new String(char[] a);
		// String s4= new String(char[] a,int startIndex,int count);
		// String s5= new String(byte[] b);
		//String实现了接口Serializable，说明String可以串行化（在网络上传输）
		//              Comparable [String对象可以比较大小]
		// String is final, can't be jicheng
		//String 有属性 private final char calue[]；用于存放字符串内容
		//Attention:value is final，.can't be edited
		// (value redirect to new address,but single word content can be changed)


		String name="jack";
		name="tom";
		final char value[] = {'a','b','c'};
		value[0]='H';
		System.out.println();
		//value =v2;不可以修改value 的地址
//		不能给数组一个新的变量

		//string底层最重要的是真正存放字符放在了属性中，final属性，final类，实现两个接口，
	}
}
