package ShapeHirerachy;

public class Triangle extends Shape{
    private int base;
    private  int height;
    private int perpedicular;

    Triangle t;
    public void setBase(int base){
        this.base=base;
    }

    public void setHeight(int height){
        this.height=height;
    }


    public void setPerpedicular(int perpedicular){
        this.perpedicular=perpedicular;
    }

      @Override
    public void area(){
        t=new Triangle();
        System.out.println("Area of triangle is "+ (base * height)/2);
    }
     @Override
    public void perimeter(){
        t=new Triangle();
        System.out.println("perimeter of triangle"+ base+ height + perpedicular);
    }


}

