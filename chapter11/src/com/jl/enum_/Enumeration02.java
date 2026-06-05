package com.jl.enum_;

public class Enumeration02 {
	public static void main(String[] args) {


		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.AUTUMN);
		System.out.println(Season.WINTER);

	}
}

//演示自定义枚举实现

class Season {
	private String name;
	private String desc;

	//3. 在Season内部直接创建固定的对象:不能修改它的属性(无set方法),只读
	public final static Season SPRING = new Season("Spring", "warm");
	public final static Season SUMMER = new Season("Summer", "hot");
	public final static Season AUTUMN = new Season("Autumn", "cool");
	public final static Season WINTER = new Season("Winter", "cold");

	//1. 将构造器私有化:防止直接new
	public Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}
	//重写toString测试
	@Override
	public String toString() {
		return "Season{" +
				"name='" + name + '\'' +
				", desc='" + desc + '\'' +
				'}';
	}
	//2. 去掉set相关方法:防止属性被修改

//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setDesc(String desc) {
//		this.desc = desc;
//	}
}