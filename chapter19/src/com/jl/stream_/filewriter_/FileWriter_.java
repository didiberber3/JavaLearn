package com.jl.stream_.filewriter_;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {

    }

    @Test
    public void m1() {
        String filePath = "E:\\story.txt";

        FileWriter file = null;
        char[] chars = {1, 2, 3, 4, 5, 6};

        try {
            file = new FileWriter(filePath);

//            写入单个字符
            file.write('h');
//            写入指定数组
            file.write(chars);
//            写入数组的指定部分
            file.write("韩顺平教育", 0, 3);
//            写入整个字符串
            file.write("我Chovy给我拿好了呀!");
//            写入字符串的指定部分
            file.write("我Chovy给我拿好了呀!", 0, 6);

//            在数据量大时可以选择循环


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                file.close();
            } catch (IOException e) {
            }
        }

    }

}
