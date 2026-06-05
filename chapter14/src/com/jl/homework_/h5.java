package com.jl.homework_;

import java.util.TreeSet;

@SuppressWarnings("all")
public class h5 {
	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
		treeSet.add(new Person());
		treeSet.add(new Person());
		treeSet.add(new Person());
		treeSet.add(new Person());
		treeSet.add(new Person());
	}
}

class Person implements Comparable {

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}