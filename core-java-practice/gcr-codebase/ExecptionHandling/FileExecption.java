package EXECPTIONHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExecption {
    public static void main(String[] args) {
        try{
            FileReader r=new FileReader("BMICalculator.java");
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
