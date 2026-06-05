package com.jl.stream_.reader_;

import java.io.*;

public class BufferedCopy02_ {
    public static void main(String[] args) {

        String fileName = "E:\\JavaTest\\END1.png";
        String fileCopy = "E:\\JavaTest\\END1copied.png";

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileCopy));
            byte[] bytes = new byte[1024];
            int length;

            while ((length = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, length);


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                bufferedOutputStream.close();
                bufferedInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("copyOK!");
        }


    }
}
