package com.jl.stream_.file_;

import org.testng.annotations.Test;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {


    }

    @Test
    //    获取文件的信息
    public void info() {
//        先创建文件对象
        File file = new File("e:\\news3.txt");
//        调用相应的方法得到对应的信息
        System.out.println("文件名字：" + file.getName());
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件父目录：" + file.getParent());
        System.out.println("文件大小(字节)：" + file.length());
        System.out.println("文件是否存在(boolean)：" + file.exists());
        System.out.println("文件是否是文件(boolean)：" + file.isFile());
        System.out.println("文件是否是目录(boolean)：" + file.isDirectory());


    }
}
