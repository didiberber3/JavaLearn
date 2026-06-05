package com.jl.hm;

public class Hm06 {
	public static void main(String[] args) {

//5. 实例化Person对象“唐僧”，要求一般情况下用Horse作为交通工具，遇到大河时用Boat作为交通工具

		Person TS = new Person("唐僧", new Horse());
		TS.common();//马
		TS.common();//马
		TS.passRiver();//过河
		TS.common();//马
		TS.passRiver();//过河
		TS.passRiver();//过河
		TS.passRiver();//过河
		TS.common();//马
		TS.mont();



	}

}

