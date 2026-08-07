package StreamOutput;

import java.io.*;

public class BufferedOutputExample {

    public static void main(String[] args) {

        try {

            FileOutputStream fos = new FileOutputStream("StreamOutput/output.txt");

            BufferedOutputStream bos = new BufferedOutputStream(fos);

            String msg = "Buffered Output Stream Example";

            bos.write(msg.getBytes());

            bos.flush(); // Writes buffered data to the file

            bos.close();
            fos.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}