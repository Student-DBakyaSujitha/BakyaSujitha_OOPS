package StreamInput;

import java.io.ByteArrayInputStream;

public class ByteArrayExample {
    public static void main(String[] args) {

        byte[] data = {'J', 'A', 'V', 'A'};

        ByteArrayInputStream bis = new ByteArrayInputStream(data);

        int ch;

        while ((ch = bis.read()) != -1) {
            System.out.print((char) ch);
        }
    }
}