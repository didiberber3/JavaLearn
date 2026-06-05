package com.jl.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("all")
public class ListExercise {
	public static void main(String[] args) {

//	要求List的实现类ArrayList完成
		List list = new ArrayList();
		//	添加10个以上的元素比如String"hello"
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		list.add("11");
		list.add("12");
		System.out.println(list);
//	在第二号位插入一个元素 hspjy
		list.add(1, "hspjy");
		System.out.println("在第二号位插入一个元素 hspjy");
		System.out.println(list);
//	获得第五个元素,
		System.out.println("第五个元素为" + list.get(4));
		System.out.println(list);

//	删除第六个元素,
		list.remove(5);
		System.out.println("删除了第六个元素:\n" + list);
//	修改第七个元素,

		list.set(6, "edited:7");
//	使用迭代器遍历集合
		System.out.println("使用迭代器遍历了集合");

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.print(" " + next);
		}
	}
}
