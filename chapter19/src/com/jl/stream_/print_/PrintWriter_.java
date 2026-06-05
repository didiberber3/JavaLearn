package com.jl.stream_.print_;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws Exception {


//        PrintWriter printWriter = new PrintWriter(System.out);

        String filePath = "E:\\JavaTest\\log2.txt";
        PrintWriter printWriter = new PrintWriter(new FileWriter(filePath));
        printWriter.print("helloJason");

//        如果不关闭Writer，log就不会刷新
        printWriter.close();
    }
}
