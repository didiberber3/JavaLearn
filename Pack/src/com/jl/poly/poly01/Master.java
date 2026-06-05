package com.jl.poly.poly01;

public class Master {
	private String name;

	public Master() {

	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	//使用多态可以解决Master为不同Animal喂食的问题
	//animal 编译类型是Animal,可以指向(接收) Animal 子类的一个对象
	//food 编译类型是Food,可以指向Food子类的对象
	public void feed(Animal animal, Food food) {
		System.out.println("主人" + name + ",给" + animal.getName() + ",吃了" + food.getName());

	}

//	//Master feed Bone to Dog
//	public void feed(Dog dog, Bone bone) {
//		System.out.println("主人 " + name + ",给小狗 " + dog.getName() + ",吃 " + bone.getName());
//	}

}
