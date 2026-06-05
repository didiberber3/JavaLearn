package com.jl;

public class Homework02 {
	public static void main(String[] args) {

		try {
			//args.length=0
//			args[4] = null;
			if (args[4].equals("john")) {   //此处可能数组越界异常 和空指针异常
				System.out.println("AA");
			} else {
				System.out.println("BB");
			}
			Object o = args[2]; //String =>Object 向上转型
			Integer i = (Integer) o;    //向下转型
		} catch (ClassCastException e) {
			System.out.println("类型转换异常");
		}

	}
}
