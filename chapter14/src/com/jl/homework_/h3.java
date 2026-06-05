package com.jl.homework_;

import java.util.*;

public class h3 {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("jack", 650);
		m.put("tom", 1200);
		m.put("smith", 2900);

//      修改jack的工资为2600;
		m.put("jack", 2600);

//		为所有员工加薪100元;
		System.out.println("为所有员工加薪100元（entrySet）");
		Set map = m.entrySet();
		for (Object o : map) {
			Map.Entry e = (Map.Entry) o;
			Integer i = (Integer) e.getValue() + 10;
			e.setValue(i);

			System.out.println(m);

		}
//		keySet
		System.out.println("为所有员工加薪100元（keySet）");
		Set set = m.keySet();
		for (Object key : set) {
			m.put(key, (Integer) m.get(key) + 100);
			System.out.println(m);
		}

//		遍历集合中所有的员工
		System.out.println("遍历所有员工(增强for)");
		for (Object o : map) {
			Map.Entry e = (Map.Entry) o;
			System.out.println(e.getKey());
		}

//		遍历集合中所有的工资
		System.out.println("遍历所有工资(迭代器)");

		Iterator it = map.iterator();
		while (it.hasNext()) {
			Map.Entry next = (Map.Entry) it.next();
			System.out.println(next.getKey() + "=" + next.getValue());

		}
	}
}
