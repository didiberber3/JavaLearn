package com.jl.stream_.reader_;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) throws IOException {

        String fileName = "E:\\story.txt";
        String fileCopy = "E:\\hello.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileCopy));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();

        }
        bufferedReader.close();
        bufferedWriter.close();


//        因为Reader和Writer是字符流,所以不能操作二进制文件,会导致文件读取数据错误,如音乐,图片,视频

//        弹幕:现在练习用throw可以精简代码，但如果真的出现异常，则下面的代码就不能继续执行了，包括关闭流语句
//        所以实际使用时还是要用try-catch-finally，才能确保不管有没有异常都能关闭流。
    }
}
