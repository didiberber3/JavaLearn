package com.jl.houserent.utils;

import javax.rmi.CORBA.Util;

public class TestUtility {
	public static void main(String[] args) {

//		String utility = Utility.readString(3);
//		System.out.println("s=" + utility);

		//如果用户直接回车 给一个默认值
		//把该方法当作api使用
		//"hsp"
		System.out.println("请输入");
		String hsp = Utility.readString(10, "hspNB");
		System.out.println("hsp=" + hsp);
		//这里是直接使用类调用方法的
		//Class.function()
		//当一个方法是static时,就是一个静态方法
		//静态方法可以直接通过类名调用
		A a = new A();
		A.cry();

	}
}

class A {
	public void hi() {

	}

	public static void cry() {

	}
}