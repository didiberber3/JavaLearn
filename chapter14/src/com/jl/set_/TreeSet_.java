package com.jl.set_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
	public static void main(String[] args) {
//		1. 当我们使用无参构造器创建TreeSet时，仍然是无序的，
//		2. 当希望添加的元素按照字符串大小来排序：
//		3. 使用TreeSet提供的一个构造器，可以传入一个比较器（匿名内部类），
//          指定排序规则：

		//按字母表顺序
		TreeSet treeSet = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {

				//调用方法 两个字符串字母表大小进行比较
//				return ((String) o1).compareTo((String) o2);
				//字符串长度从小到大
				//其规则，如果长度相等，就不再比较，也不会添加
				return ((String) o1).length() - ((String) o2).length();
				//字符串长度从大到小
//				return ((String) o2).length() - ((String) o1).length();
			}
		});

		treeSet.add("john");
		treeSet.add("sun");
		treeSet.add("lucy");
		treeSet.add("lic");
		treeSet.add("lic");
		treeSet.add("moon");
		System.out.println(treeSet);
	}
}
