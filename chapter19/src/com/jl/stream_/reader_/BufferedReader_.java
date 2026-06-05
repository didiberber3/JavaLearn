package com.jl.stream_.reader_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\chens\\Desktop\\泛型.md";
//        创建BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
//        读取
        String line;

//        当返回为null时表示读取完毕
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

//        关闭流
        bufferedReader.close();

//        close源码:

//        public void close() throws IOException {
//        synchronized (lock) {
//            if (in == null)
//                return;
//            try {
//                in.close();
//            } finally {
//                in = null;
//                cb = null;
//            }
//        }
//    }

    }
}
