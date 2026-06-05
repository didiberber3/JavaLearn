package properties_hm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class hm1 {
    public static void main(String[] args) throws IOException {

        String filePath = "src\\mytemp";
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("正在创建文件夹...");
            file.mkdir();
            String filePath1 = filePath + "\\hello.txt";
            File file1 = new File(filePath1);
            if (!file1.exists()) {
                System.out.println("创建文件中...");
                file1.createNewFile();

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
                bufferedWriter.write("hello,world~");

                bufferedWriter.close();


            } else {
                System.out.println("文件已经存在!");
            }

        }else {
            System.out.println("文件已经存在");
        }


        System.out.println("hm1完成");




    }
}

