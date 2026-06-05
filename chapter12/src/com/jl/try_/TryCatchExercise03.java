package com.jl.try_;

public class TryCatchExercise03 {
}


class Exception3 {
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
			++i;
			System.out.println("i=" + i);
		}
	}


	public static void main(String[] args) {
		System.out.println(Exception3.method());
	}
}

