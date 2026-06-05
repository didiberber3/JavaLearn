package com.jl.hm;

public class Person {
	private String name;
	private Vehicles vehicles;

	//如何不浪费构建对象时不浪费交通工具.
	public Person(String name, Vehicles vehicles) {
		this.name = name;
		this.vehicles = vehicles;
	}


	public void passRiver() {
		//得到船
		//判断一下当前的vehicles属性是否存在

		//如何防止始终使用的是传入的🐴对象呢 instanceOf
		if (!(vehicles instanceof Boat)) {
			//这里使用的是多态
			vehicles = VehiclesFactory.getBoat();
		}
		vehicles.work();
	}

	public void common() {
		//得到马儿
		//判断一下当前的vehicles属性是否存在
		if (!(vehicles instanceof Horse)) {
			//这里使用的是多态
			vehicles = VehiclesFactory.getHorse();
		}
		vehicles.work();

	}

	public void mont() {
		//得到飞机
		//判断一下当前的vehicles属性是否存在
		if (!(vehicles instanceof Air)) {
			//这里使用的是多态
			vehicles = VehiclesFactory.getAir();
		}
		vehicles.work();

	}
}
