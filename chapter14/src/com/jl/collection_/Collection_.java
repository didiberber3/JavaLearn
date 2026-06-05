package com.jl.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

@SuppressWarnings({"all"})

public class Collection_ {
	public static void main(String[] args) {
//		集合主要是两组 - 单列集合 双列集合
//		单列集合是放   单个对象
//		双列放        键值对
//		Collection
//		Collection接口由两个重要的子接口-List Set 他们的实现子类都是单列集合
//		Map 接口的实现子类 是双列集合， 存放的K-V 键Key值Value对

		//单列集合
		ArrayList arrayList = new ArrayList();
		arrayList.add("jack");
		arrayList.add("Tom");

		//双列集合
		HashMap hashMap = new HashMap();
		hashMap.put("number1", "Jackie");
		hashMap.put("number2", "Shanghai");


	}
}
