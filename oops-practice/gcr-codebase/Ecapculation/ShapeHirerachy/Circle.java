package ShapeHirerachy;

public class Circle extends Shape{
    private int Radius;
    private final double pi=3.14;
    Circle c;

    public void setRadius(int Radius){

        this.Radius=Radius;
    }

    @Override
    public void area(){
        c=new Circle();
        System.out.println("Area of Circle"+c.Radius*c.Radius*c.pi);
    }

    @Override
    public void perimeter() {
        c=new Circle();
        System.out.println("Perimeter of Circle is "+2*c.pi*c.Radius);
    }
}
