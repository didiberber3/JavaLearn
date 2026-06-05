package com.jl.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_ {

	public static void main(String[] args) throws ParseException {

		//获取当前系统时间
		//这里的Date是在java.util包下的
		//按照国外的方式默认输出日期，需要进行格式转换，因此通常需要对格式进行转换


		// 得到Date仍然在输出时，还是按照国外的形式，如果希望指定格式输出，需要转换
		// 在把String_>Date，使用的 sdf格式需要和给的String格式相同，否则，会抛出*转换*异常
		Date date = new Date();
		System.out.println(date);
		Date date1 = new Date(8745358);//通过指定距离1970000000毫秒数得知时间
		System.out.println(date1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
		String format = sdf.format(date);
		System.out.println("当前日期=" + format);

		String s = "2026年01月13日 05:54:30 星期二";
		Date parse = sdf.parse(s);
		System.out.println(parse);





	}
}

class Dog {
	private String name;
	private int age;


	public Dog(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void cry() {

	}

	class Air {

	}

	//说明一下diagram IDEA properties 的含义

	public void setAddress(String address) {

	}
}