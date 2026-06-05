package com.jl.innerclass_;


/**
 * 演示匿名内部类的使用
 */
public class AnonymousInnerClass {
	public static void main(String[] args) {
		Outer04 outer04 = new Outer04();
		outer04.method();
	}
}

class Outer04 { // 外部类
	private int n1 = 10;

	public void method() {
		//基于接口的匿名内部类
		//1. 需求,使用IA接口,并且创建一个对象
		//2. 传统方式就是写一个类,实现该接口,并创建对象
		//3. 需求:不想创建新类,only use class once
		//		IA tiger = new Tiger();
		//		tiger.cry();
		//4. 使用匿名内部类简化开发
		//5. tiger的编译类型是什么: IA
		//6. tiger的运行类型是: 就是匿名内部类
		/**
		 * 底层: 会分配一个类名Outer04$1
		 * class Outer04$1 implements IA{
		 *                @Override
		 *            public void cry() {
		 * 				System.out.println("老虎叫唤...");
		 *            }
		 * }
		 */
		//7. jdk底层在创建了匿名内部类 Outer04$1,立即马上就创建了一个Outer04$1实例
		//   并且把地址返回给tiger
		//8. 匿名内部类使用一次就不能再使用了,指针成功获取了地址.
		IA tiger = new IA() {   //new了一个实例,代码块中写好
			@Override
			public void cry() {
				System.out.println("老虎叫唤...");
			}
		};


		System.out.println("tiger的运行类型是:" + tiger.getClass());
		tiger.cry();


		//演示基于类的匿名内部类
		//分析
		//1. father 的编译类型 Father
		//2. father 的运行类型 Outer04$2
		//3. 成员匿名内部类
		/*
		 * class Outer04$2 extends Father{
		 * public void test() {
				System.out.println("Override test() already");
			}
		 * }
		 * */
		//4. 同时也返回了 匿名内部类 Outer04$2的对象.
		//5. 注意"jack"的参数回传递给构造器
		Father father = new Father("jack") {
			@Override
			public void test() {
				System.out.println("Override test() already");
			}
		};

		System.out.println("father对象的运行类型:" + father.getClass());
		father.test();

		//基于抽象类的匿名内部类
		Animal animal = new Animal() {
			@Override
			void eat() {
				System.out.println("小狗吃骨头");
			}
		};
		animal.eat();

	}

}

//2.
//class Tiger implements IA {
//	@Override
//	public void cry() {
//		System.out.println("老虎叫唤");
//	}
//}


interface IA {
	public void cry();
}

class Father {
	public Father(String name) {

		System.out.println("接收到的name=" + name);
	}

	public void test() {
	}
}

abstract class Animal {
	abstract void eat();
}