package com.jl.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings("all")

public class CollectionIterator {
	public static void main(String[] args) {
		Collection col = new ArrayList();

		col.add(new Book("三国演义", "罗贯中", 10.1));
		col.add(new Book("小李飞刀", "狗笼", 45.3));
		col.add(new Book("红楼梦", "曹雪芹", 67.4));

		System.out.println("col=" + col);
//		遍历col集合
//		1.先得到col对应的迭代器
		Iterator iterator = col.iterator();

		//快捷键 快速生成while itit
		while (iterator.hasNext()) {
			Object obj = iterator.next();//编译类型Object，运行类型Book
			System.out.println(obj);
		}
//		第二次遍历
		iterator = col.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next );

		}
//		当退出while循环后，这时iterator迭代器，指向最后的元素，此时，next已经在最后一个元素的下面，
		try {
			iterator.next();
		} catch (Exception e) {
			System.out.println("log:无元素异常");
		}


	}
}

class Book {
	private String name;
	private String author;
	private double price;

	public Book(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book{" +
				"name='" + name + '\'' +
				", author='" + author + '\'' +
				", price=" + price +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}