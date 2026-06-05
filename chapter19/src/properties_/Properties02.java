package properties_;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {

//        使用Properties 类来读取mysql.properties文件
        Properties properties = new Properties();

//        加载
        properties.load(new FileReader("src\\mysql.properties"));
//        把 kv 显示到 控制台
        properties.list(System.out);
//        根据key 获取对应的值
        String user = properties.getProperty("user");
        String psw = properties.getProperty("psw");

        System.out.println("user: " + user + "\n psw: " + psw);
    }
}
