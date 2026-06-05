package com.jl.stream_.transformation;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws Exception {
        String filePath = "E:\\JavaTest\\hello.txt";
        String charset = "utf-8";
        OutputStreamWriter oSW = new OutputStreamWriter(new FileOutputStream(filePath), charset);

        oSW.write("hello");

        oSW.close();
        System.out.println("按照" + charset + "运行文件");
    }
}
