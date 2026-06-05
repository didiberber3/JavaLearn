package com.jl.collection_;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")

public class CollectionMethod {
	public static void main(String[] args) {

		List arrayList = new ArrayList();
//		add 添加单个元素:Object 参数
		arrayList.add("Object");
		arrayList.add("Object1");
		arrayList.add("Object2");
		arrayList.add("Object3");
		arrayList.add("Object4");
		arrayList.add("Object5");
		System.out.println(arrayList);

//		remove 删除指定元素
		arrayList.remove("Object");//删除Object元素
		System.out.println(arrayList);
		arrayList.remove(2);//删除索引2的元素
		System.out.println(arrayList);

//		contains 查找某个元素是否存在
//		bool
		System.out.println(arrayList.contains("Object1"));

//		size获取元素个数
//		int
		System.out.println(arrayList.size());

//      isEmpty 判断集合是否为空
//		bool
		System.out.println(arrayList.isEmpty());

//		addAll 添加多个元素
		List list = new ArrayList();
		list.add("hlm");
		list.add("sgyy");
		list.add("shz");
		list.add("xyj");
		arrayList.addAll(list);
		System.out.println(arrayList);

//		containsAll查找多个元素是否存在,需要输入一个对象
//		bool
		System.out.println(arrayList.containsAll(list));

//		removeAll删除多个对象
		arrayList.add("1234");
		arrayList.removeAll(list);

		System.out.println(arrayList);

//		clear 清空
		arrayList.clear();
		System.out.println(arrayList);

	}
}

