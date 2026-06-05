package com.jl.map_;

import java.util.HashMap;

public class HashMapSource1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("java", 10);//T
		map.put("php", 20);//T
		map.put("java", 20);//替换java 10
		System.out.println("此时key=java，value=" + map.get("java"));

		System.out.println(map);


//		解读源码：
		/*
		1.  执行构造器 new HashMap();
			初始化加载因子 loadfactor = 0.75
			HashMap$Node[] table = null

		2.  执行put 会调用hash()计算key的hash值  (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
			public V put(K key, V value) {  //key=java value=10
	            return putVal(hash(key), key, value, false, true);
	        }

        3.  执行put value

			
			Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];




		 */
	}
}
