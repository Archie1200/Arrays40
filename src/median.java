import java.util.Arrays;

public class median {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,6,7,9,5};
        calcMedian(arr);
    }
    public static void calcMedian(int []arr){
        Arrays.sort(arr);
        double a,b=0;
        if(arr.length%2!=0)
            System.out.println((double) arr[arr.length/2]);
        else{
             a=arr[(arr.length-1)/2];
             b=arr[(arr.length/2)];
            System.out.println((a+b)/2.0);

    }}
}
