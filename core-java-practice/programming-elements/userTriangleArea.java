package programmingElement;
import java.util.Scanner;
public class userTriangleArea {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int base=sc.nextInt();
       int height=sc.nextInt();
       //area cm
       double area=0.5*base*height;

       //area in inches
       double area1=(float)area/2.54;

       System.out.println("area in cm ="+area);
       System.out.println("area in inches= "+area1);
   sc.close();
}
}
