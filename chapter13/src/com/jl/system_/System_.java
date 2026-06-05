package com.jl.system_;


import java.util.Arrays;

public class System_ {
	public static void main(String[] args) {
//		System.out.println("ok1");
//		System.exit(0);
//		//status参数：
////		0 正常退出
//		System.out.println("ok2");


		//arrayCopy
		int[] src = {1, 2, 3};
		int[] dest = new int[3];//dest={0,0,0};


		//参数：原数组，开始拷贝的数组索引 待拷贝数组 开始拷贝的数组索引 数组元素被赋值的数量
		System.arraycopy(src, 0, dest, 0, 3);

		System.out.println("dest=" + Arrays.toString(dest));






	}
}
