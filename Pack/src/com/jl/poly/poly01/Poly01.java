package com.jl.poly.poly01;

public class Poly01 {
	public static void main(String[] args) {
		Master tom = new Master();
		tom.setName("小嘉");

		Dog bigHuang = new Dog();
		bigHuang.setName("大黄");

		Bone boneDBG = new Bone();
		boneDBG.setName("大棒骨");
		Food bone1 = new Bone();
		bone1.setName("大骨头!");

		tom.feed(bigHuang, boneDBG);

		//添加给小猪喂米饭
		Pig pig = new Pig();
		pig.setName("小琪");
		Rice rice = new Rice();
		rice.setName("漂亮饭");
		tom.feed(pig, rice);
	}
}
