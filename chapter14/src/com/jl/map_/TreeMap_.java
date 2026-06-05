package com.jl.map_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {


	public static void main(String[] args) {

//		使用默认的构造器，创建的treeMap是没有规则的
//		添加构造器
		TreeMap treeMap = new TreeMap(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {

//				return ((String) o2).compareTo((String) o1);
				return ((String) o1).length() - ((String) o2).length();
//
			}
		});

		treeMap.put("john", 100);
		treeMap.put("sun", 88);
		treeMap.put("lic", 100);
		treeMap.put("lucy", 88);
		treeMap.put("john", 100);
		System.out.println(treeMap);
	}
}
