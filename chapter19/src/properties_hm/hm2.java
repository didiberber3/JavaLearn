package properties_hm;

import java.io.*;

public class hm2 {
    public static void main(String[] args) throws IOException {

        String filePath = "src\\mytemp\\hello.txt";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf-8"));        String line;
        int count = 0;
        while ((line = bufferedReader.readLine()) != null) {

            System.out.println(++count + " " + line);
        }
        if (bufferedReader!=null){
            bufferedReader.close();
        }
    }
}
