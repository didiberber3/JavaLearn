package com.jl.stream_.filereader_;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {


    }


    //    使用字符读取文件
    @Test
    public void m1() {
        String filepath = "E:\\story.txt";
        FileReader fr = null;

        //单个字符读取
        int data = 0;


        try {
            fr = new FileReader(filepath);


            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                }
            }
        }


    }

    //    使用字符数组读取文件
    @Test
    public void m2() {
        String filepath = "E:\\story.txt";
        FileReader fr = null;

        int readLen = 0;
        char[] buffer = new char[1024];


        try {
            fr = new FileReader(filepath);
//
            while ((readLen = fr.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, readLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                }
            }
        }


    }

}
