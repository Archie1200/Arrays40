import java.util.*;

public class appearMorethanKtimes {
    public static void main(String[] args) {
        int arr[]={3,1,2,2,1,2,3,3};
        check(arr,4);
    }
    public static void check(int arr[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        for(Map.Entry p:map.entrySet()){
            int value=(int)p.getValue();
            if(value>arr.length/k)
                System.out.println(p.getKey());
        }
    }
}
