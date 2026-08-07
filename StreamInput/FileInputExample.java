package StreamInput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputExample {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("StreamInput/sample.txt");

            int i;

            System.out.println("Contents of the file:");

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            fis.close();
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}