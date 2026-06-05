package com.jl.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_ {
	public static void main(String[] args) {
//		第三代日期

//		使用DateTimeFormatter 对象来进行格式化
//		创建DateTimeFormatter 对象
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年-MM月-dd日 HH小时-mm分钟-ss秒");
		String format = dtf.format(ldt);
		System.out.println("格式化的日期:" + format);
		System.out.println(ldt);
		System.out.println("年=" + ldt.getYear());
		System.out.println(ldt.getMonthValue() + "月");
		System.out.println("月=" + ldt.getMonth());
		System.out.println("日=" + ldt.getDayOfMonth());
		System.out.println("时=" + ldt.getHour());
		System.out.println("分=" + ldt.getMinute());
//		ldt.getYear();
//		ldt.getMonthValue();
//		ldt.getMonth();
//		ldt.getDayOfMonth();
//		ldt.getHour();
//		ldt.getMinute();
//		ldt.getSecond();

		//提供 plus 和minus方法可以对当前时间进行加或减
		//看看890天后是什么时候,把年月日时分秒打印出来
		LocalDateTime localDateTime = ldt.plusDays(890);
		System.out.println(dtf.format(localDateTime));
		LocalDateTime localDateTime1 = ldt.minusMinutes(3456);
		System.out.println(dtf.format(localDateTime1));


	}
}
