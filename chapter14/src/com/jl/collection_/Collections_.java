package com.jl.collection_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_ {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("jason");
		list.add("kobe");
		list.add("lwj");
		list.add("xiaoqi");


		Collections.reverse(list);
		System.out.println("reverse-list=" + list);

		Collections.shuffle(list);
		System.out.println("shuffle-list=" + list);

		Collections.sort(list);
		System.out.println("sort-list=" + list);
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof String) {
				}
				return ((String) o2).length() - ((String) o1).length();
			}
		});


		//compare() 方法的返回值决定了排序顺序：
		//返回值	含义	顺序:从前往后遍历，o1<o2 o1在前，o1>o2 o2在前
		//负数 (<0)	o1 < o2	o1 排在 o2 前面
		//0	o1 = o2	顺序不变
		//正数 (>0)	o1 > o2	o1 排在 o2 后面

		System.out.println("sortComparator-list=" + list);


		Collections.swap(list, 1, 2);//索引范围不能超过数组长度，否则报错越界异常IndexOutOfBoundException
		System.out.println("swap-list=" + list);

	}
}
