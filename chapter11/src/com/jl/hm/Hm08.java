package com.jl.hm;

public class Hm08 {
	/**
	 * 枚举类
	 * <p>
	 * 1. 创建一个Color枚举类
	 * 2. 有 RED,BLUE,BLACK,YELLOW,GREEN这个五个枚举值/对象;
	 * 3. Color有三个属性redValue，greenValue，blueValue,
	 * 4. 创建构造方法，参数包括这三个属性，
	 * 5. 每个枚举值都要给这三个属性赋值，
	 * 6. 三个属性对应的值分别是red:255,0,0 blue:0,0,255 black:0,0,0 yellow:255,255,0 green:0,255,0
	 * 7. 定义接口，里面有方法show，要求Color实现该接口
	 * 8. show方法中显示三属性的值
	 * 9. 将枚举对象在switch语句中匹配使用
	 */
	public static void main(String[] args) {
		Color green = Color.GREEN;
		green.show();

		//在switch中放入枚举对象
		//在每个case后,直接写上在枚举类中,定义的枚举类对象
		switch (green) {
			case YELLOW:
				System.out.println("匹配到黄色");
				break;
			case RED:
				System.out.println("匹配到红色");
				break;
			case BLUE:
				System.out.println("匹配到蓝色");
				break;
			case BLACK:
				System.out.println("匹配到黑色");
				break;
			case GREEN:
				System.out.println("匹配到绿色");
				break;

		}
	}

}

interface showColor {
	public void show();
}

enum Color implements showColor {
	RED(255, 0, 0),
	BLUE(0, 0, 255),
	BLACK(0, 0, 0),
	YELLOW(255, 255, 0),
	GREEN(0, 255, 0);

	private int redValue;
	private int greenValue;
	private int blueValue;

	Color(int redValue, int greenValue, int blueValue) {
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.blueValue = blueValue;
	}

	@Override
	public void show() {
		System.out.println("此颜色的RGB值为" + "\t" + "R:" + this.redValue + "\t" + "G:" + this.greenValue + "\t" + "B:" + this.blueValue);
	}
}