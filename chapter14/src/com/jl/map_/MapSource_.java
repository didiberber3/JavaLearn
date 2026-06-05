package com.jl.map_;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class MapSource_ {

	public static void main(String[] args) {
		Map map = new HashMap();

		map.put("no1", "hsp");
		map.put("no2", "zwj");
		map.put(new Car(), new Person());
		System.out.println(map);
		/* Map底层
		1. k-v 最后是HashMap$Node node = new Node(hash,key,value,null)
		2. k-v 为了方便程序员的遍历,还会 在底层创建一个EntrySet (集合) ,该集合存放的元素类型是Entry,
				而一个Entry对象就有k,v EntrySet<Entry<k,v>> entrySet;
				EntrySet中，定义的类型是EntrySet，但是实际上存放的还是HashMap$Node
				这时 因为static class Node<K,V> implements Map.Entry<K,V>
				当把 HashMap$Node 对象存放到EntrySet就方便我们的遍历，因为Map.Entry提供了重要方法
				K getKey() ;
				V getValue();
		* */
		Set set = map.entrySet();

		System.out.println(set.getClass());


		for (Object o : set) {
//
//			System.out.println(o.getClass());    //HashMap$Node
//			为了从HashMap$Node 取出K-V
//			1. 先做一个向下转型
			Map.Entry entry = (Map.Entry) o;
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}

		Set set1 = map.keySet();
		System.out.println(set1.getClass());
		Collection values = map.values();

		System.out.println(values.getClass());
	}
}

class Car {

}

class Person {

}