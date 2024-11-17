package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFileUsingInputStream {
    public static void main(String[] args)  {
        try {
            FileInputStream file = new FileInputStream("/index.html");

            int content;

            while((content = file.read()) != -1) {
                System.out.print((char) content);
            }

            String name = "Sameer";

            System.out.println(name.getBytes());
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
