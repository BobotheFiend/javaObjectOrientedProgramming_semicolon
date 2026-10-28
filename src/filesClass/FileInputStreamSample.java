package filesClass;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamSample {

    public static void main(String[] args) {

        String fileLocation = "/home/gamp/Desktop/first_issue.txt";
        try(FileInputStream fileInputStream = new FileInputStream(fileLocation)) {
            System.out.println(new String(fileInputStream.readAllBytes()));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}

