package Calculator;

public interface IcalMeth {
    void add(int a,int b);
    void subtract(int a, int b);
    void Multi(int a, int b);
    void Divide(int a, int b);
}

class CalTwoimpl implements IcalMeth {
    @Override
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    @Override
    public void Multi(int a, int b) {
        System.out.println(a * b);
    }

    @Override
    public void Divide(int a, int b) {
        System.out.println(a / b);
    }

    @Override
    public void subtract(int a, int b) {
        System.out.println(a - b);
    }
}
    class Main{
        static void main(String[] args) {
            IcalMeth cal=new CalTwoimpl();
            cal.add(2,6);
            cal.Divide(4,2);
            cal.Multi(3,4);
            cal.subtract(4,2);
        }
    }



