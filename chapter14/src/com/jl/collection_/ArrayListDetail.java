package com.jl.collection_;

import java.util.ArrayList;

@SuppressWarnings("all")
public class ArrayListDetail {

	public static void main(String[] args) {

		//没有做限制符
		//    public boolean add(E e) {
		//        ensureCapacityInternal(size + 1);  // Increments modCount!!
		//        elementData[size++] = e;
		//        return true;
		//    }
		ArrayList arrayList = new ArrayList();
		arrayList.add(null);
		arrayList.add("jack");
		arrayList.add(null);
		System.out.println(arrayList);

	}
}
