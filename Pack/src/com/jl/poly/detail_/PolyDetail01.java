package com.jl.poly.detail_;

public class PolyDetail01 {
	public static void main(String[] args) {

		//向上转型,父类编译,子类运行
		//父类引用 指向 子类对象
		Animal cat1 = new Cat();
		Object cat2 = new Cat();

		//向上转型的调用方法规则如下:
		//子类可以调用父类的所有成员,需要遵守访问权限
		//但是父类不能调用子类的特有成员
		//因为在编译阶段,能调用哪些成员,是由编译类型决定的
		//cat1.catchMouse();
		//最终的运行效果,需要看子类的具体体现
		//依然是先进后出,先从子类开始找,最底层层级往上
		cat1.sleep();
		cat1.run();
		cat1.play();
		cat1.show();
		cat1.eat();//猫吃鱼

		//向下转型调用猫抓老鼠
		//cat1.catchMouse();    //错误
		//cat的编译类型是Cat,运行类型是Cat:(Cat)
		Cat cat = (Cat) cat1;
		cat.catchMouse();

//		Dog dog = (Dog) cat1;   //Cat是Animal的子类,但Dog不是Cat的子类,没有继承关系

		System.out.println("OK!");

	}
}
