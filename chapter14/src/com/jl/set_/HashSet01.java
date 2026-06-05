package com.jl.set_;


import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
public class HashSet01 {
	public static void main(String[] args) {

		Set hashSet = new HashSet();

		System.out.println(hashSet.add(null));
		System.out.println(hashSet.add(null)); //f
		System.out.println(hashSet.add("hello"));
		System.out.println(hashSet.add("world"));
		System.out.println(hashSet.add("john"));
		System.out.println(hashSet.add("lucy"));


		hashSet.remove("john");

		System.out.println(hashSet);

		hashSet = new HashSet();    //重新创建一个新的hashSet对象，所以为空
		System.out.println(hashSet);//0

		//hashmap can;t add same argument/value
		hashSet.add("lcuy");//true
		hashSet.add("lcuy");//false
		System.out.println(hashSet.add(new Dog("Tom")));//they are not same 对象
		System.out.println(hashSet.add(new Dog("Tom")));//can be added
		System.out.println(hashSet);

//		classical preview
//		String to address,cant add two hsp,

//		String重写了Hashcode和equals方法,使得相同的String指向同一个地址
		hashSet.add(new String("hsp"));
		hashSet.add(new String("hsp"));
		System.out.println(hashSet);

	}
}

class Dog {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}