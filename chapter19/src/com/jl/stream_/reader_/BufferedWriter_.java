package com.jl.stream_.reader_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
//        定义路径
        String fileName = "E:\\story.txt";
//        新建bw对象,构造器中写对应的流,对应的流中写好路径
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

//        new FileWriter(fileName)表示覆盖写入
//        new FileWriter(fileName,true)表示追加写入


//        定义要写入的文本
        String line = "雨下整夜...";
        String line2 = "我的爱溢出就像雨水...";

//        写入
        bufferedWriter.write(line);
//        写入换行符
        bufferedWriter.newLine();
//        再次写入
        bufferedWriter.write(line2);

//        关闭流
        bufferedWriter.close();


    }
}
