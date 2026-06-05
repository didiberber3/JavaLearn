package com.jl.map_;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
	public static void main(String[] args) {

		Map hashMap = new HashMap();


//		map总的kv可以是任何引用类型的数据，会封装到HashMap$Node 对象中

//		常用String作为key，包括new Obj
		//   Key - Value
		hashMap.put("no1", "hsp");
		hashMap.put("no2", "zwj");

//	    会将hsp替换掉
		hashMap.put("no1", "zsf");
		hashMap.put("no3", "zsf");//NEW NODE

		hashMap.put(null, null);
		hashMap.put(null, "abc"); //等价替换

		hashMap.put("no4", null);//NEW NODE
		hashMap.put("no5", null);//NEW NODE
//		k只能有一个，v能有很多个

//		get方法 传入一个key 返回对应的value,
//		key不能重复所以返回的value永远只有一个
		System.out.println(hashMap.get("no2"));

		System.out.println("hashMap" + hashMap);

	}
}
