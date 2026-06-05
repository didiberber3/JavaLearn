package com.jl.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapExercise {
	public static void main(String[] args) {

		Map map = new HashMap();

		map.put(1, new Employee(1, 1800, "tom"));
		map.put(2, new Employee(2, 180000000, "jack"));
		map.put(3, new Employee(3, 1800, "rose"));

//		遍历
//      第一种遍历方式
		System.out.println("第一种遍历方式：");
		Set keyset = map.keySet();
		for (Object key : keyset) {
//			先获取value
			Employee o = (Employee) map.get(key);
			if (o.getSal() > 18000) {
				System.out.println(o);
			}

		}
//		entrySet的迭代器
		Set entrySet = map.entrySet();
		Iterator itr = entrySet.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			Employee o = (Employee) entry.getValue();
			if (o.getSal() > 18000) {
				System.out.println(o);
			}
		}

		// EntrySet 的增强for
		Set entrySet1 = map.entrySet();
		for (Object obj : entrySet1) {
			Map.Entry entry = (Map.Entry) obj;  // 先转换为 Entry Entry的类为HashMap$Node
//			System.out.println(entry.getClass());//class java.util.HashMap$Node
			Employee o = (Employee) entry.getValue();  // 直接从 Entry 获取值
			if (o.getSal() > 18000) {
				System.out.println(o);
			}
		}


	}
}

class Employee {
	private int id;
	private String name;
	private double sal;

	public Employee(int id, double sal, String name) {
		this.id = id;
		this.sal = sal;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", sal=" + sal +
				'}';
	}
}