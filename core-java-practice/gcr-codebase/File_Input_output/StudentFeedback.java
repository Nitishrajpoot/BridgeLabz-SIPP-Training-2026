package file_input_output;
import java.io.BufferedReader;
import java.util.*;

public class StudentFeedback {
    public static void main(String[] args) {
       try{
            Scanner sc=new Scanner(System.in);
            BufferedReader reader=new BufferedReader(new InputStreamReader(5));
            int count=0;
            System.out.println("Enter 5 feedbacks");
            for(int i=1;i<=5;i++){
                System.out.println("feedbacks"+i+" :");
                String feedback=reader.readLine();

                if(feedback.toLowerCase().contains("good")){
                    count++;
                }
            }
            System.out.println("Enter your word to ");
            String word=sc.next();
             
            
       }
       catch(Exception e){
        
       }
    }
}
