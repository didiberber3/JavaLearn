package com.jl.generic.customgeneric;

import java.util.ArrayList;
import java.util.List;
//		泛型继承的通配符

public class GenericExtends {
	public static void main(String[] args) {
		Object o = new String("xx");

//		ArrayList<Object> strings = new ArrayList<String>();
//	    泛型没有继承性

		List<Object> objects = new ArrayList<>();
		List<String> objects1 = new ArrayList<>();
		List<AA> objects2 = new ArrayList<>();
		List<DD> objects3 = new ArrayList<>();
		List<CC> objects4 = new ArrayList<>();

		printCollection1(objects);
		printCollection1(objects1);
		printCollection1(objects2);
		printCollection1(objects3);
		printCollection1(objects4);


//		printCollection2(objects);
//		printCollection2(objects1);
		printCollection2(objects2);
		printCollection2(objects3);
		printCollection2(objects4);


		printCollection3(objects);
//		printCollection3(objects1);
		printCollection3(objects2);
//		printCollection3(objects3);
//		printCollection3(objects4);

	}

	public static void printCollection1(List<?> c) {
		for (Object o : c) {
			System.out.println(o);
		}
	}

	public static void printCollection2(List<? extends AA> c) {
		for (Object o : c) {
			System.out.println(o);
		}
	}

	public static void printCollection3(List<? super AA> c) {
		for (Object o : c) {
			System.out.println(o);
		}
	}
}

class AA {
}

class DD extends AA {
}

class CC extends DD {
}