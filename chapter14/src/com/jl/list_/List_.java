package com.jl.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
	public static void main(String[] args) {
//		List集合类中元素有序，添加顺序 去除顺序一直，且可重复
		List list = new ArrayList();

		list.add("jackie");
		list.add("tom");
		list.add("marry");
		list.add("shunping");
		System.out.println(list + "\n");

//		List集合中的每个元素都有其对应的顺序索引，即支持索引
//		索引是从0开始的
		System.out.println(list.get(0));//jackie
		System.out.println(list.get(3));//顺平

	}
}
