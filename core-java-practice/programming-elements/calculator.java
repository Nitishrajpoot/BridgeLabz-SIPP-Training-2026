package programmingElement;

public class calculator {
    public static void main(String[] args) {
        float a = 12;
        float b = 9;

        float add = a + b;
        float sub = a - b;
        float multi = a * b;
        float div = a / b;

        System.out.printf(
            "Addition = %.3f%nSubtraction = %.3f%nMultiplication = %.3f%nDivision = %.3f%n",
            add, sub, multi, div );
    }
}
