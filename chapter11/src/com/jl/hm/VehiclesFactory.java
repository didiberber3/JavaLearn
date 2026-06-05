package com.jl.hm;

public class VehiclesFactory {
	private static Horse horse = new Horse();   //饿汉式

	//先完成再优化
	//将方法static, 方便
	public static Horse getHorse() {
		return horse;
	}

	public static Boat getBoat() {
		return new Boat();
	}

	public static Air getAir(){
		return new Air();
	}
}
