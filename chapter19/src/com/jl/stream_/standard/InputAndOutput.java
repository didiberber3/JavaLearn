package com.jl.stream_.standard;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {


//        System.in 的编译类型是 InputStream
//        System.in 的运行类型是 BufferedInputStream 缓冲流
//        表示标准输入：键盘
        System.out.println(System.in.getClass());

        System.out.println("请输入内容");
        Scanner scanner = new Scanner(System.in);

        System.out.println(scanner.next());


//        System.in 的编译类型是 PrintStream
//        System.in 的运行类型是 PrintStream 打印流
//        表示标准输出：显示器
        System.out.println(System.out.getClass());

        System.out.println("Hello World!");
        System.out.println("Hello Jason!");


    }
}
