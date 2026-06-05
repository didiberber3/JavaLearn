package com.jl.stream_.transformation;

import java.io.BufferedReader;
import java.io.FileReader;

public class CodeQuestion {
    public static void main(String[] args) throws Exception {
//        读取文件
        String filePath = "E:\\JavaTest\\hello.txt";
//        创建字符输入流, BufferedReader 处理流,FileReader字符流
//        在默认情况下,读取文件是按照 UTF-8编码 读取的,如果编码发生问题,就会出现乱码
//        解决办法 就是按字节读，然后指定编码方式，再转为字符
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String s = bufferedReader.readLine();

        System.out.println(s);

        bufferedReader.close();

    }
}
