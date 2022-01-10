import java.util.Arrays;

public class maxpro {
    public static void main(String[] args) {
        int arr[]={1,2,10,-5,9,2,1};
        maxProduct(arr);
    }
    public static void maxProduct(int arr[]){
        long max=1,min=1,finalMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 0) {
                max = 1;
                min = 1;
                continue;
            }
            long temp = max;
            max = Math.max(Math.max((long) arr[i], max * arr[i]), min * arr[i]);
            min = Math.min(Math.min((long) arr[i], temp * arr[i]), min * arr[i]);
            if (max > finalMax)
                finalMax = max;
        }
        System.out.println(finalMax);
    }
}
//variations to be seen later(size k)
