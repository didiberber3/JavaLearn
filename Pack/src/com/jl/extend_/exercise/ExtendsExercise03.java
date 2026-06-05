package com.jl.extend_.exercise;

public class ExtendsExercise03 {
	public static void main(String[] args) {
		PC pc = new PC("intel", "500", "IBM", "鞋盒");    //传入一共四个参数
		pc.showInfo();//调用pc中的showInfo，但showInfo调用的是computer中的getDetail()

	}
}

//定义computer类
class Computer {
	//定义computer的属性
	private String cpu;
	private String ram;
	private String storage;

	//构造器初始化对象
	public Computer(String cpu, String ram, String storage) {
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
	}

	//连续使用get,set方法,提取私有属性,公开化
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	//返回computer信息getDetail方法
	public String getDetail() {
		return (
				"此计算机的详细信息为：\n" +
						"CPU: " + this.cpu + "\n" +
						"内存: " + this.ram + "\n" +
						"硬盘: " + this.storage
		);
	}
}

//新建PC类
class PC extends Computer {
	//创建私有对象brand
	private String brand;

	// 初始化对象,并用super调用父类的构造器


	public PC(String cpu, String ram, String storage, String brand) {
		super(cpu, ram, storage);    // 调用PC初始化构造器,借super为computer构造器赋值
		this.brand = brand;    // 最后一个String brand为PC类中的brand属性赋值
	}

	//使用get set方法,读取private属性brand
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	//showInfo方法,显示输出结果,但Computer类中已经有getDetail方法用于输出结果,此处进行调用,并新加brand进行输出.
	public void showInfo() {
//		System.out.println(getCpu()+getRam()+getStorage());
		//通过调用父类
		System.out.println(getDetail() + "\n品牌：" + this.brand);
	}
}
