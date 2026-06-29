package ShapeHirerachy;

public class Rectangle extends Shape {

    private  int length;
    private int breadth;
    Rectangle g;

    public void setLength(int length){
        this.length=length;
    }
    public void setBreadth(int breadth){
        this.breadth=breadth;
    }


    @Override
    public void area(){
        g=new Rectangle();
        System.out.println("Area of rectangle is :"+length*breadth);

    }

    @Override
    public void perimeter(){
        g=new Rectangle();
        System.out.println("parameter of reacting is  :"+2*length*breadth);

    }

}
