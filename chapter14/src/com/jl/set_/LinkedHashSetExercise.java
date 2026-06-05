package com.jl.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedHashSetExercise {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(new Car("三汽大众", 34567));
		lhs.add(new Car("一汽大众", 99999));
		lhs.add(new Car("二汽大众", 9789));
		lhs.add(new Car("一汽大众", 99999));


		System.out.println(lhs);

	}
}

class Car {
	private String name;
	private double price;

	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Car)) return false;
		Car car = (Car) o;
		return Double.compare(price, car.price) == 0 && Objects.equals(name, car.name);
	}

	//只保留hashcode
//	hashcode相同，equals不同 也能加进去
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}