package com.jl.map_;

import java.util.*;

public class MapFor {
	public static void main(String[] args) {

		//		演示map接口的常用方法
		Map map = new HashMap();
//		put 添加
		map.put("sb7", new Book("", 100));
		map.put("sb7", "sb8");
		map.put("sb7", null);//替换
		map.put("sb9", "sb8");
		map.put(null, "sb10");

//		第一组：先取出 所有的key 用过key 取出对应的value
		System.out.println("先取出所有的key,用key取出对应的value:增强for");
		System.out.println("第一组");
		Set keyset = map.keySet();
		for (Object key : keyset) {
			System.out.println(key + "-" + map.get(key));
		}


//		二 迭代器
		System.out.println("先取出所有的key,用key取出对应的value:迭代器");

		Iterator iterator = keyset.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next + "-" + map.get(next));
		}

//		第二组 把所有的value取出        迭代器 增强for 普通for
		Collection values = map.values();
		System.out.println("把所有的value取出:增强for");
		for (Object value : values) {
			System.out.println(value);
		}


		System.out.println("把所有的value取出:迭代器");
		Iterator iterator2 = values.iterator();
		while (iterator2.hasNext()) {
			Object next = iterator2.next();
			System.out.println(next);
		}


//		第三组 EntrySet 来获取k-v
		Set set = map.entrySet();
//		增强for
		System.out.println("========EntrySet:增强for========");
		for (Object key : set) {
//			将entry转成mapEntry 向上转型
			Map.Entry entry = (Map.Entry) key;
			System.out.println(map.get(key) + "=" + entry.getValue());
		}


		System.out.println("========EntrySet:迭代器Iterator========");
		Iterator iterator3 = set.iterator();
		while (iterator3.hasNext()) {
			Object next = iterator3.next();
			Map.Entry entry = (Map.Entry) next;
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}


	}
}
