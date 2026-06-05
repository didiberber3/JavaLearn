package com.jl.homework_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class h2 {
	public static void main(String[] args) {


		Car car1 = new Car("rose", 99999);
		Car car2 = new Car("lucy", 1111111);

		List list = new ArrayList();
//		add
		list.add(car1);
		list.add(car2);
		System.out.println("添加car1,car2=" + list);
//		remove
		list.remove(car1);
		System.out.println("删除了car1" + list);
//		contains
		boolean contains = list.contains(car1);
		System.out.println("是否含有car1=" + contains);
//		size
		System.out.println("元素数量=" + list.size());
//		isEmpty
		boolean isEmpty = list.isEmpty();
		System.out.println("是否为空=" + list.isEmpty());
//		clear
		list.clear();
		System.out.println("clear后的数组=" + list);
//		addAll
		List src = new ArrayList();
		src.add(car1);
		src.add(car2);
		list.addAll(src);
		System.out.println("添加多个元素(Car1,Car2)后的list=" + list);
//		removeAll
		list.removeAll(src);
		System.out.println("删除多个元素(Car1,Car2)后的list=" + list);

		//		add测试car1car2
		list.add(car1);
		list.add(car2);
		System.out.println("添加car1,car2=" + list);

//		增强for遍历list
		System.out.println("增强for遍历list");
		for (Object o : list) {
			Car car = (Car) o;
			System.out.println(car);
		}

		System.out.println("迭代器Iterator遍历list");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Car car = (Car) itr.next();
			System.out.println(car);
		}


	}
}

class Car {
	private String name;
	private double price;

	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}