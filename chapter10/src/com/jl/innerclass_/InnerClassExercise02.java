package com.jl.innerclass_;


/*
测试手机类的闹钟功能，通过匿名内部类对象作为参数，打印：懒猪起床了
再传入另一个匿名内部类对象，打印：小伙伴上课了
 */
public class InnerClassExercise02 {
	public static void main(String[] args) {

		//测试手机类的闹钟功能，通过匿名内部类对象作为参数，打印：懒猪起床了
		CellPhone cellPhone = new CellPhone();
		cellPhone.alarmClock(new Bell() {
			@Override
			public void ring() {
				System.out.println("懒猪起床了...");
			}
		});
		//再传入另一个匿名内部类对象，打印：小伙伴上课了
		cellPhone.alarmClock(new Bell() {
			@Override
			public void ring() {
				System.out.println("小伙伴上课了...");
			}
		});
	}


}

interface Bell {
	void ring();
}

class CellPhone {
	public void alarmClock(Bell bell) { //形参是Bell接口类型
		bell.ring();
	}
}