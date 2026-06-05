package com.jl.stream_.transformation;

import sun.nio.cs.ext.GBK;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_ {
    public static void main(String[] args) throws Exception {
//        将字节流转成字符流,指定编码
        String filePath = "E:\\JavaTest\\hello.txt";
////       1. 把 new FileInputStream 转成 InputStreamReader ,同时指定编码
//        InputStreamReader gbk = new InputStreamReader(new FileInputStream(filePath), "utf-8");
////       2. 把 gbk 传给BufferedStreamReader
//        BufferedReader bufferedReader = new BufferedReader(gbk);


//        将2和3合在一起写
//        BufferedReader bufferedReader = new BufferedReader(
//        new InputStreamReader(
//        new FileInputStream(filePath), "utf-8"));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf-8"));


//       3. 读取
        String s = bufferedReader.readLine();
        System.out.println("读取内容= \"" + s + "\"");
//       4. 关闭外层流

        bufferedReader.close();

    }
}
