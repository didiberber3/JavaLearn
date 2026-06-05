package properties_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Properties_ {
    public static void main(String[] args) throws IOException {
//        读取mysql.properties 文件，并得到相应的ip user psw
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\mysql.properties"));

        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] split = line.split("=");
            System.out.println(split[0]+" 's value = "+split[1]);
        }
        bufferedReader.close();
    }
}
