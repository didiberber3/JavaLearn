package com.jl.stream_.copy_;

import org.testng.annotations.Test;

import java.io.*;

public class FileCopy_ {
    String filePath = "D:\\JavaProject\\chapter19\\out\\a.txt";
    String copyFilePath = "D:\\JavaProject\\chapter19\\out\\b.txt";
    String dir = "D:\\JavaProject\\chapter19\\out\\";


    public static void main(String[] args) {
//        完成 文件拷贝, a.txt 拷贝到D盘,前提是文件存在

//        创建文件的输入流,将文件读入到程序
//        创建文件的输出流,将文件输出到硬盘
    }

    @Test
    public void input() {
        File directory = new File(dir);
        if (!(directory.exists())) {

            System.out.println("目录不存在");
        } else {
//            条件判断如果两个文件存在,就执行程序,
            if (!(new File(filePath).exists())) {

//            否则提示文件不存在
                System.out.println("源文件不存在!");
            } else {


                copy();

            }
        }
    }

    public void copy() {
        byte[] buffer = new byte[8192];
        int readLen = 0;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(copyFilePath);
//            读取文件内容 int
            while ((readLen = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, readLen);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("写入成功");
    }
}
