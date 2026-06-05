package com.jl.stream_.file_;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class DirectoryCreate {
    public static void main(String[] args) {

    }

    //    判断是否存在，存在就删除
    @Test
    public void m1() {

        String filePath = "e:\\news3.txt";

        File file = new File(filePath);
        if (file.exists()) {

            if (file.delete()) {
                System.out.println("删除成功");

            } else {
                System.out.println("删除失败");
            }

        } else {
            System.out.println("该文件不存在");
        }
    }

    //    在java编程中，目录也是一种文件
    @Test
    public void m2() {

        String filePath = "e:\\demo2";

        File file = new File(filePath);
        if (file.exists()) {

            if (file.delete()) {
                System.out.println("删除成功");

            } else {
                System.out.println("删除失败");
            }

        } else {
            System.out.println("该文件不存在");
        }
    }


    //    判断目录是否存在，如果存在就提示存在，如果不存在就创建
    @Test
    public void m3() {
        String filePath = "e:\\demo2";

        File file = new File(filePath);
        if (file.exists()) {

            System.out.println(filePath + "存在");


        } else {
//            创建一级目录使用mkdir  多级目录使用mkdirs
            if (file.mkdirs()) {
                System.out.println("创建成功");
            } else {
                System.out.println("创建失败");
            }
        }
    }
}
