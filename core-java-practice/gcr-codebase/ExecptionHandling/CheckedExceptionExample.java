package EXECPTIONHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


    

    import java.io.*;

public class CheckedExceptionExample {

    public static void main(String[] args) {

        try {
            BufferedReader br =
                    new BufferedReader(
                            new FileReader("data.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}

