package com.jl.collection_;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("all")
public class CollectionFor {
	public static void main(String[] args) {

		Collection col = new ArrayList();
		col.add(new Book("三国演义", "罗贯中", 10.1));
		col.add(new Book("小李飞刀", "狗笼", 45.3));
		col.add(new Book("红楼梦", "曹雪芹", 67.4));

//		使用增强for循环
		for (Object book : col) {
			System.out.println("book: " + book);
		}
//		快捷键 I
		for (Object o : col) {
			System.out.println(o);
		}


//		也可以直接在数组中使用
		int[] nums = {1, 2, 3};
		for (int i : nums) {
			System.out.println("nums:" + i);
		}
	}
}
