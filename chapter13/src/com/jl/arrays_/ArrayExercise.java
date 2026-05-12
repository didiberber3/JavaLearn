package com.jl.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
	public static void main(String[] args) {

	/*
	自定义Book类,里面包含name和price 按price排序从大到小,要求使用两种方法排序,有一个Book[] books=四本书对象.
	使用前面学习过的传递,实现Comparator接口匿名内部类,也称为定制排序,
	可以按照price1 从大到小排序,2 从小到大 3 按照书名长度从大到小排序
	 */

		Book[] books = new Book[4];
		books[0] = new Book("红楼梦", 100);
		books[1] = new Book("金瓶梅新", 30);
		books[2] = new Book("青年文摘20年", 60);
		books[3] = new Book("Java从入门到入土", 80);

		//price从大到小
//		Arrays.sort(books, new Comparator<Book>() {
//			@Override
//			public int compare(Book o1, Book o2) {  //compare的返回值是一个int
//				Book book1 = (Book) o1;
//				Book book2 = (Book) o2;
//
//				//进行类型转换,从double类型 做判断,返回用 1 0 -1 区分
//				//如果发现结果和我们输出的不一致,就修改返回的1 0 -1的位置
//				double pricevalue = book2.getPrice() - book1.getPrice();
//				if (pricevalue > 0) {
//					return -1;
//
//				} else if (pricevalue < 0) {
//					return 1;
//				} else {
//					return 0;
//				}
//
//			}
//		});

		//从小到大
//		Arrays.sort(books, new Comparator<Book>() {
//			@Override
//			public int compare(Book o1, Book o2) {  //compare的返回值是一个int
//				Book book1 = (Book) o1;
//				Book book2 = (Book) o2;
//
//				//进行类型转换,从double类型 做判断,返回用 1 0 -1 区分
//				//如果发现结果和我们输出的不一致,就修改返回的1 0 -1的位置
//				double pricevalue = book2.getPrice() - book1.getPrice();
//				if (pricevalue > 0) {
//					return -1;
//
//				} else if (pricevalue < 0) {
//					return 1;
//				} else {
//					return 0;
//				}
//
//			}
//		});

		//按书名排序
		Arrays.sort(books, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {  //compare的返回值是一个int
				Book book1 = (Book) o1;
				Book book2 = (Book) o2;

				return book2.getName().length() - book1.getName().length();


			}
		});


		System.out.println(Arrays.toString(books));
	}
}

class Book {
	private String name;
	private double price;

	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return this.name;
	}
}



