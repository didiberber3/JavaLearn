package com.jl.stream_.print_;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {

        PrintStream out = System.out;
//        在默认情况下，PrintStream 输出数据的位置是标准输出 即 显示器
        out.print("helloJason");

//        print源码：
//        public void print(String s) {
//        if (s == null) {
//            s = "null";
//        }
//        write(s);
//    }
//        真正进行输出的是write方法
        System.out.println();

//        本质一样
        out.write("hellojasons".getBytes());


//        我们可以去修改打印流输出的位置 / 设备
//        修改到 "E:\\JavaTest\\log1.txt"
        System.setOut(new PrintStream("E:\\JavaTest\\log1.txt"));

        //    public static void setOut(PrintStream out) {
        //        checkIO();
        //        setOut0(out);
        //    }

//       ⬆️ 这是个native方法，修改了out

//        此字符串就会输出到 "E:\\JavaTest\\log1.txt"
        System.out.println("helloJason");

    }
}
