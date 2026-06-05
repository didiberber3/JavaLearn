package com.jl.date_;

import java.time.Month;
import java.util.Calendar;

public class Calendar_ {
	public static void main(String[] args) {
		//Calendar是一个抽象类，构造器是private
		//可以通过getInstance() 来获取实例
		//提供大量的字段供给程序员
		//Calendar没有专门的格式化方法所以需要自己来组合显示
		//如果我们要24小时
		Calendar c = Calendar.getInstance();
		System.out.println("c=" + c);
		System.out.println("年：" + c.get(Calendar.YEAR));
		System.out.println("月：" + c.get(Calendar.MONTH) + 1);
		System.out.println("日：" + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("时：" + c.get(Calendar.HOUR));
		System.out.println("分：" + c.get(Calendar.MINUTE));
		System.out.println("秒：" + c.get(Calendar.SECOND));

		//月有bug 但是已经忘了咋写了 算了，再见
		//又修好了

		System.out.println("当前时间是：" + c.get(Calendar.YEAR) + "年-"
				+ (c.get(Calendar.MONTH) + 1) + "月-"
				+ c.get(Calendar.DAY_OF_MONTH) + "日-"
				+ c.get(Calendar.HOUR/*如果要用24小时，改成HOUR_OF_DAY*/) + "时-"
				+ c.get(Calendar.MINUTE) + "分-"
				+ c.get(Calendar.SECOND) + "秒"
		);

	}
}
