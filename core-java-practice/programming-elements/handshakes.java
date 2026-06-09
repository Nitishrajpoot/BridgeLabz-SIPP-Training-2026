package programmingElement;

public class handshakes {
    public static int handshake(int n){
        if(n==1){
            return 1;

        }
        int totHandShakes=n*handshake(n-1);
        
        return totHandShakes;
    }
    public static void main(String[] args) {
       int n=5;
      System.out.println(handshake(n));
    }
}
