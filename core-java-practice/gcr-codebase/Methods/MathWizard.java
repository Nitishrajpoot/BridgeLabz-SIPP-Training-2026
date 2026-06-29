package function;

public class MathWizard {
    public static int factorial(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
              fact*=i;
        }
        return fact;
    }

    public static int fibbonacci(int n){
          int first=0,second=1;
          for(int i=1;i<=n;i++){
            
            int next=first+second;
            first=second;
            next=first;
          }
    }
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            
            } 
             
        }
        return true;
        
    }
    public static void main(String[] args) {
        System.out.println(isPrime(12));
        System.out.println(factorial(5));
        System.out.println();
    }
}
