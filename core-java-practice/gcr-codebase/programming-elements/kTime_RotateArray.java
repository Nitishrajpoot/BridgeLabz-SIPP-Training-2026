package programmingElement;

public class kTime_RotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,32,43,5,54};
        int size=arr.length;
        int k=1;
        k=k%size;
        int [] temp=new int[size];
        for(int i=0;i<size;i++){
            temp[(i+k)%size]=arr[i];
        }
        for(int i=0;i<size;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
