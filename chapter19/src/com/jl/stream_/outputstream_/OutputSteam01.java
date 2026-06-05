package com.jl.stream_.outputstream_;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class OutputSteam01 {
    public static void main(String[] args) {

    }


    @Test
    public void writeFile() {
        FileOutputStream fileOutputStream = null;
        String filePath = "E:\\a.txt";

        try {

            /*
            new FileOutputStream(filePath) 创建方式 ,当写入内容时,会覆盖原来的内容,
            new FileOutputStream(filePath,true) 这种创建方式会追加到内容的最后
            */




            fileOutputStream = new FileOutputStream(filePath,true);

//            写入一个字节
//            fileOutputStream.write('a');
//            写入字符串
            String str = "hello,world!";
//            str.byte()可以把字符串->字节数组
//            fileOutputStream.write(str.getBytes());

            fileOutputStream.write(str.getBytes(), 0, str.length());
        } catch (IOException e) {

            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
