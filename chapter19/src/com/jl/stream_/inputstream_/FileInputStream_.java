package com.jl.stream_.inputstream_;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() {
        String filePath = "E:\\hello.txt";
        int readData = 0;
//        字节数组
        int readLen = 0;
        byte[] buffer = new byte[1024];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);

//            从该输入流读取最多b.length字节的数据到字节数组。此方法将阻塞
//            返回-1 表示读取完毕
//            如果读取正常，返回实际读取的字节数
            while ((readLen = fileInputStream.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, readLen));
            }
//            如果返回-1,表示读取完毕

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//            当文件读取完毕后，关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
