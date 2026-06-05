package com.jl.codeblock;

public class Block01 {
	public static void main(String[] args) {
		Movie movie1 = new Movie("你好李焕英");
		Movie movie2 = new Movie("你好李焕英", 20);
		Movie movie3 = new Movie("你好李焕英", 20, "贾玲");


	}
}

class Movie {
	private String name;
	private double price;
	private String director;

	//代码块的调用优先于构造器
	//静态代码块随着类的执行而执行,如果是普通代码块 创建一个对象就会执行一次
	static {
		System.out.println("电影屏幕打开");
		System.out.println("广告开始");
		System.out.println("电影正式开始");
	};

	public Movie(String name, double price, String director) {
		this.name = name;
		this.price = price;
		this.director = director;
		System.out.println("3被调用");
		System.out.println();
	}

	public Movie(String name, double price) {
		this.name = name;
		this.price = price;
		System.out.println("2被调用");
		System.out.println();
	}

	public Movie(String name) {
		this.name = name;
		System.out.println("1被调用");
		System.out.println();
	}
}
