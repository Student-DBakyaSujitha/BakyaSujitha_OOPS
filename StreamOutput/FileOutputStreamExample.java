package StreamOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("StreamInput/output.txt");

            String msg = "Hello Java";

            fos.write(msg.getBytes());

            fos.close();

            System.out.println("Data written successfully.");
        }
        catch(IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}