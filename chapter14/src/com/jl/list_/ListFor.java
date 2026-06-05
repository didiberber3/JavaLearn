package com.jl.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFor {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

//		方式1
		System.out.println("方式一");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);

		}

//		方式2
		System.out.println("方式二");
		for (Object o : list) {
			System.out.println(o);
		}

//		方式3
		System.out.println("方式三");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}
}
