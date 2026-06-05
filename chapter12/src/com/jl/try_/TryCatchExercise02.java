package com.jl.try_;

public class TryCatchExercise02 {
}

class Exception2 {
	public static int method() {
		int i = 1;
		try {
			i++;//2
			String[] names = new String[3];
			if (names[1].equals("tom")) {   //空指针异常
				System.out.println(names[1]);

			} else {
				names[3] = "hspedu";

			}
			return 1;

		} catch (ArrayIndexOutOfBoundsException e) {
			return 2;

		} catch (NullPointerException e) {
			return ++i;//3
		} finally {
			return ++i;//4
		}
	}


	public static void main(String[] args) {
		System.out.println(Exception2.method());
	}
}
