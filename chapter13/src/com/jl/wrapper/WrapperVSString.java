package com.jl.wrapper;

public class WrapperVSString {
	public static void main(String[] args) {

		//Wrapper(Integer) 转 String
		Integer i = 100;
		//方式1
		String str1 = i + "大力";//java会将int toString成String //Java would make int toString into String,
		System.out.println("String:\t"+str1);
		//方式2
		String str2 = i.toString();
		System.out.println("i.toString:\t"+str2);
		//方式3
		String str3 = String.valueOf(i);
		System.out.println("String.valueOf(i):\t"+str3);

		//String 转Integer
		String str4 = "12345";
		Integer i2 = Integer.parseInt(str4);    //使用到自动装箱
		Integer i3 = new Integer(str4);

		System.out.println("Integer.parseInt:\t"+i2);
		System.out.println("new Integer:\t"+i3);

	}
}
