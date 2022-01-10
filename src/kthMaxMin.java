import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class kthMaxMin {
    public static void main(String[] args) {
        int arr[]={1,7,-4,-2,0,8,6,10,9};
        display(arr,2);
    }
    public static void findmax_min(int arr[],int k){
        Arrays.sort(arr);
        System.out.println(k+"th smallest element:");
        System.out.println(arr[k-1]);
        System.out.println(k+"th Largest element:");
        System.out.println(arr[arr.length-k]);
    }
    //kth smallest
    public static void display(int arr[], int k){
        TreeMap<Integer,Integer> map= new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int freq=0;
        for(Map.Entry p:map.entrySet()){
            freq+=(int)p.getValue();
            if(freq>=k) {
                System.out.println((int) p.getKey());
                break;
            }
        }
    }
}
//TC:O(nlogn)
