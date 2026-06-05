package com.jl.collection_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections02_ {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("jason");
		list.add("endfield");
		list.add("lucy");
		list.add("endfield");
		list.add("tom");
		list.add("V");
		list.add("endfield");

		Object maxlist = Collections.max(list);
		System.out.println("max(list)=" + maxlist);


		Object maxlistC = Collections.max(list, new Comparator() {
			//字符串长度最长
			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof String) {
				}
				return ((String) o1).length() - ((String) o2).length();
			}
		});
		System.out.println("maxC(list)=" + maxlistC);

//		list中元素o出现的次数
		Object frequencyList = Collections.frequency(list, "endfield");
		System.out.println("frequencyList(list)=" + frequencyList);


//		copy
		List list1 = new ArrayList();
//		copy计算数组大小，如果数组空余为0 则抛出异常
//		为了完成一个完整的copy,需要为list的index进行占位，防止越界
		for (int i = 0; i < list.size(); i++) {
			list1.add("");
		}
		Collections.copy(list1, list);
		System.out.println("copylist.list=" + list);
		System.out.println("copylist.list1=" + list1);


//		replace
		Collections.replaceAll(list, "tom", "TOM");
		System.out.println("replaceAll(list, tom)=" + list);
	}
}
