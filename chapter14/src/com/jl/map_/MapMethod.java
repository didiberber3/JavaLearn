package com.jl.map_;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class MapMethod {
	public static void main(String[] args) {

//		演示map接口的常用方法
		Map map = new HashMap();
//		put 添加
		map.put("sb7", new Book("", 100));
		map.put("sb7", "sb8");
		map.put("sb7", null);//替换
		map.put("sb9", "sb8");
		map.put(null, "sb10");
//		remove 删除
		map.remove(null, "sb10");//可以不填写value，只删除key下的value

//		get 根据key获取value

		//sb10
		System.out.println(map.get("key=null,value=" + null));

//		size 获取元素个数
		System.out.println("k-v" + map.size());

//		isEmpty 判断个数是否为零
		System.out.println(map.isEmpty());//false

//		clear
		map.clear();
		System.out.println(map);

//		containsKey
		System.out.println(map.containsKey("sb7"));
		System.out.println(map.containsValue("sb7"));
		map.put("sb7", "sb7");
		System.out.println(map.containsKey("sb7"));
		System.out.println(map.containsValue("sb7"));

		System.out.println("map: " + map);


	}
}

class Book {
	private String name;
	private int price;

	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
}