package ShapeHirerachy;

import java.util.Scanner;



public class ShapeMenu extends ShapeMenuAbs{

    Shape s;
    @Override
    public void choice(){
        Scanner sc=new Scanner(System.in);
        while (true){
        System.out.println("1.Rectangle\n2.Circle\n3.Triangle");
        int choice=sc.nextInt();
        if(choice==4)
            break;

        switch (choice){
            case 1:
                s=new Rectangle();
                ((Rectangle)s).setLength(100);
                ((Rectangle)s).setBreadth(20);
                s.area();
                s.perimeter();
                break;
            case 2:
                s=new Circle();
                new Circle().setRadius(32);
                s.area();
                s.perimeter();
                break;

            case 3:
                s=new Triangle();


                ((Triangle)s).setBase(12);
                ((Triangle)s).setHeight(20);
                s.area();
                s.perimeter();
                break;

        }


    }
}}
