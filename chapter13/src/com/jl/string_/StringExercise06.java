package com.jl.string_;

public class StringExercise06 {
	public static void main(String[] args) {
		//以下语句创建了几个对象，画出内存布局图
		String s1="hello";
		s1="haha";
		//创建了一个对象，常量池中有一个hello，也有一个haha，第一次赋值指向hello 第二次赋值指向haha
	}
}
