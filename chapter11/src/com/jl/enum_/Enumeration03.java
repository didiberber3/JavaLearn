package com.jl.enum_;

public class Enumeration03 {
	public static void main(String[] args) {


		System.out.println(Season2.SPRING);
		System.out.println(Season2.SUMMER);

	}
}

//演示使用enum关键字实现枚举类
//1. 使用关键字 enum 替代class
//2. 用	SPRING("Spring", "warm");
//      常量名(实参列表);      如果有多个常量 使用,间隔即可
//   替代 public final static Season SPRING = new Season("Spring", "warm");
//3. 如果要用enum枚举,对象应该创建在 属性的前面


enum Season2 {
	SPRING("Spring", "warm"), SUMMER("Summer", "hot"),
	WHAT/*如果我们使用的是无参构造器创建常量对象(甚至可以不写括号)*/;

	private String name;
	private String desc;



//	public final static Season SPRING = new Season("Spring", "warm");
//	public final static Season SUMMER = new Season("Summer", "hot");
//	public final static Season AUTUMN = new Season("Autumn", "cool");
//	public final static Season WINTER = new Season("Winter", "cold");

	//如果使用enum实现枚举类,


	Season2() {
	}

	private Season2(String name, String desc) {
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

}