package com.jl.list_;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")

public class ListMethod {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("jackie");
		list.add("tom");
		list.add("jason");
		list.add("sb");

		//void
		list.add(1, "我是插进来的索引1");

		System.out.println(list);
		List list1 = new ArrayList();
		list1.add("中文1");
		list1.add("中文2");
		list1.add("sb");

		list.addAll(2, list1);

		System.out.println(list);

		System.out.println(list.indexOf("tom"));//5
		System.out.println(list.lastIndexOf("sb"));//7


		System.out.println("移除了索引为0的元素:" + list.remove(0));//jackie
		System.out.println(list);

//		替换,索引一定要是存在的，否则越界异常
		list.set(0, "SET");
		System.out.println(list);

		List returnlist = list.subList(1, 2);
		System.out.println(returnlist);


	}
}
