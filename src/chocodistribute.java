import java.util.Arrays;

public class chocodistribute {
    public static void main(String[] args) {
        int arr[]={7,3,2,4,9,12,56};
        dist(arr,3);

    }
    public static void dist(int [] arr,int m){
        Arrays.sort(arr);
        int p=Integer.MAX_VALUE;
        for(int i=0;i+m-1<arr.length;i++){
            int diff=arr[i+m-1]-arr[i];
            if(diff<p)
                p=diff;
        }
        System.out.println(p);
    }
}
