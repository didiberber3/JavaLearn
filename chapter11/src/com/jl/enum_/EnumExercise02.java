package com.jl.enum_;

public class EnumExercise02 {
	public static void main(String[] args) {

		System.out.println("===所有星期的信息如下===");

		Weeks[] weeks = Weeks.values();//使用values()方法列出枚举对象
		for (Weeks week : weeks) {  //for(定义一个临时Weeks对象 week,依次从weeks中获取元素给week)
			System.out.println(week);//在每一次循环中输出week
		}


	}
}

enum Weeks {

	MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
	THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
	private String name;

	private Weeks(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
