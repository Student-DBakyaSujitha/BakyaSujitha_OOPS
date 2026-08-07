package StreamOutput;

import java.io.*;

public class DataOutputExample {

    public static void main(String[] args) {

        try {

            FileOutputStream fos = new FileOutputStream("StreamOutput/data.txt");

            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(100);
            dos.writeDouble(99.5);
            dos.writeBoolean(true);

            dos.close();

            System.out.println("Primitive data written successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}