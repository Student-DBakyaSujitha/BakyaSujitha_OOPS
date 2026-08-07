package StreamOutput;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputExample {

    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        String msg = "JAVA";

        bos.writeBytes(msg.getBytes());

        byte[] data = bos.toByteArray();

        System.out.println(new String(data));

        bos.reset();   // Optional: clears the buffer
        bos.close();
    }
}