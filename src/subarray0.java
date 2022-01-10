import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class subarray0 {
    public static void main(String[] args) {
        int arr[] = {1, -2, 8,-6, 3,-1,-2,0};
        sum0(arr, 0);
    }

    public static void sum0(int[] arr, int n) {
        Set<Integer> s = new HashSet<>();
        int sum=0;
        int d=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]==0||sum==0||s.contains(sum)) {
                d++;
            }
            s.add(sum);
        }
        if(d==0)
            System.out.println("NO");
        else{
            System.out.println("YES");
            System.out.println("No of subarrays="+" "+d);
    }}
}

