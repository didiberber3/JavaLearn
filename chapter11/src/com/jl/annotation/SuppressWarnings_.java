package com.jl.annotation;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings_ {
	//1. 不希望看到这些警告时,可以使用SuppressWarnings注解来抑制警告信息
	//{""}中可以添加想抑制的警告类型
	//
	//all:抑制所有警告()
	//4.关于@SuppressWarnings()的作用范围,是放置位置相关.
	//  通常我们可以放置具体位置前

	/*
	  @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
	  @Retention(RetentionPolicy.SOURCE) public @interface SuppressWarnings {
	  String[] value();
	  }
	 */

	// 该注解有数组 String[] value() 设置一个数组如{raw}

	@SuppressWarnings({"all"})
	public static void main(String[] args) {


		List list = new ArrayList();
		list.add("tom");
		list.add("jerry");
		list.add("fuck");
		int i;
		System.out.println(list.get(1));
	}
	//此处不在抑制器内

	public void f1() {
		List list = new ArrayList();

	}
}
