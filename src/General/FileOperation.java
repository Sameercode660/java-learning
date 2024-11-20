package General;

import java.io.FileInputStream;
import java.io.FileReader;

public class FileOperation {
    public static void main(String[] args) throws Exception {
        int digits = 0;
        int spaces = 0;
        int character = 0;

        try( FileInputStream file = new FileInputStream("E:\\java kunal\\untitled\\src\\General\\index.txt")){
            int data;

            while((data = file.read()) != -1) {
                if(Character.isDigit((char)data)) {
                    digits++;
                }

                if(Character.isWhitespace((char)data)) {
                    spaces++;
                }

                if(Character.isLetter((char)data)) {
                    character++;
                }
            }

            System.out.println("Total Chracters in file: " + character);
            System.out.println("Total Spaces in file: " + spaces);
            System.out.println("Total Digits in file: " + digits);


        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
