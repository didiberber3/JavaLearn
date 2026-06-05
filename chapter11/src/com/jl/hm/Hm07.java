package com.jl.hm;

public class Hm07 {

	public static void main(String[] args) {
		/**
		 * 内部类练习
		 * 有一个Car类，有属性temperature(温度)，车内有Air(空调)类，有吹风的功能flow，
		 * Air会监视车内的温度，如果温度超过40度则吹冷气。如果温度低于0度则吹暖气，如果在这之间则关掉空调。
		 * 实例化具有不同温度的Car对象，调用空调的fow方法，测试空调吹的风是否正确。
		 */
		Car car = new Car(40);
		car.air();
		Car car1 = new Car(55);
		car1.air();
		Car car2 = new Car(-100);
		car2.air();
	}
}

class Car {
	private double tem;

	public Car(double tem) {
		this.tem = tem;
	}
	class Air {
		public void flow() {
			if (Car.this.tem == 40) {
				System.out.println("关闭空调");
			}
			if (Car.this.tem > 40) {
				System.out.println("空调吹冷风");
			}
			if (Car.this.tem < 0) {
				System.out.println("空调吹暖风");
			}
		}
	}


	public void air() {

		Air air = new Air();
		air.flow();
	}
}