package com.jl.set_;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings("all")

public class SetMethod {
	public static void main(String[] args) {

		Set set = new HashSet();
//		实现了set接口的实现类的对象，不能存放重复的元素，（可以加一个null）
//		set接口对象存放顺序无序 但取出顺序固定
//		取出的顺序虽然不是添加的顺序，但是是固定的
		set.add("john");
		set.add("john");
		set.add("john1");
		set.add("john2");
		set.add("john3");
		set.add("john4");
		set.add(null);
		set.add(null);

		System.out.println(set);

		System.out.println("迭代器遍历");

		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);

		}

		System.out.println("增强for");

		set.remove(null);
		for (Object o : set) {
			System.out.println(o);
		}

//		不能使用传统for,因为没有提供get方法
	}
}
