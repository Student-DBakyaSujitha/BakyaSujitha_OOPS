package StreamInput;

import java.io.*;

public class DataInputExample {

    public static void main(String[] args) {

        try {
            byte[] values = {10, 20, 30};

            ByteArrayInputStream bis = new ByteArrayInputStream(values);
            DataInputStream dis = new DataInputStream(bis);

            System.out.println("Reading byte values:");

            while (dis.available() > 0) {
                System.out.println(dis.readByte());
            }

            dis.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}