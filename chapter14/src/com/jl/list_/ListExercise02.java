package com.jl.list_;

import java.util.ArrayList;
import java.util.List;

public class ListExercise02 {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Book("book3", "author3", 300));
		list.add(new Book("book1", "author1", 100));
		list.add(new Book("book4", "author4", 400));
		list.add(new Book("book2", "author2", 200));


// 冒泡排序：按价格从低到高
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				// 获取j和j+1位置的书
				Book book1 = (Book) list.get(j);
				Book book2 = (Book) list.get(j + 1);

				// 如果前面的书价格大于后面的，交换
				if (book1.getPrice() > book2.getPrice()) {
					// 交换list中j和j+1位置的元素
					list.set(j, book2);
					list.set(j + 1, book1);
				}
			}
		}
//		打印规整输出
		System.out.println("===== 排序后 =====");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}


	}

//		我写的错误屎山：
//		如何查找到 每一个元素i 中的 属性
//		list.get(i) 得到每个元素
//		将这个元素赋给一个Book temp
//		booktemp.getPrice() 是每本书的价格属性,现在要按这个进行冒泡排序
//		Book[] bookp = new Book[10];
//		Book bookt = null;
//		for (int i = 0; i < list.size() - 1; i++) {
//			for (int j = 0; j < list.size() - 1 - i; j++) {
//				bookp[j] = (Book) list.get(j);//得到每个元素
//				if (bookp[j].getPrice() > bookp[j + 1].getPrice()) {
//					bookt = (Book) list.get(j);
//					list.set(j, list.get(j + 1));
//					list.set(j + 1, bookt);
//					list.set()
//
//				}
//
//			}
//		}
}

class Book {
	private String name;
	private String author;
	private double price;

	public Book() {
	}

	public Book(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return
				"名称：" + name + '\t' +
						"作者：" + author + '\t' +
						"价格：" + price;
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