package com.jl.try_;

public class TryCatchExercise01 {
	public static int method() {
		try {
			String[] names = new String[3];//String[]Array
			if (names[1].equals("'tom")) {//空指针异常
				System.out.println(names[1]);
			} else {
				names[3] = "hspedu";
			}
			return 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			return 2;
		} catch (NullPointerException e) {    //Catch!
			return 3;
		} finally {    //一定会执行,method只会返回一个int值,在finally执行完毕,catch不会再执行
			return 4;
		}
	}

	public static void main(String[] args) {
		System.out.println(method());
	}
}//输出什么?2min