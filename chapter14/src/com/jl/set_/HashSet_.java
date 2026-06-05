package com.jl.set_;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
	public static void main(String[] args) {
//      hashset实现了set接口
//		实际上是hashmap：
//		map = new HashMap<>();
//		可以存放null值但只能有一个null
//		hashset不保证元素是有序的，取决于hash后，再确定索引的结果
//		不能有重复元素和对象

		Set hashSet = new HashSet();

		hashSet.add(null);
		hashSet.add(null);
		System.out.println("hashset=" + hashSet);//只有一个null

	}
}
