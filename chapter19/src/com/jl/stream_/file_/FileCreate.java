package com.jl.stream_.file_;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
public class FileCreate {
    public static void main(String[] args) {
    }
//    @Test
    public void creator1() {
        String filePath = "e:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            System.out.println("文件创建失败");
            throw new RuntimeException(e);
        }
    }
//    @Test
    public void creator2() {
        String filePath1 = "e:\\";
        String child = "news2.txt";
        File file = new File(filePath1, child); //在内存中

        try {
            file.createNewFile(); //真正的创建对象
            System.out.println("news2创建成功");
        } catch (IOException e) {
            System.out.println("news2创建失败");
            throw new RuntimeException(e);

        }
    }
@Test
    public void creator3() {
        String parentPath = "e:\\";
        String child = "news3.txt";

        File file = new File(parentPath, child);

        try {
            file.createNewFile(); //真正的创建对象
            System.out.println("news3创建成功");
        } catch (IOException e) {
            System.out.println("news3创建失败");
            throw new RuntimeException(e);

        }
    }
}
