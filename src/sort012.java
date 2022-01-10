import java.lang.reflect.Array;
import java.util.*;

public class sort012 {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,2,2,0,1,2,0,1,1,2,0};
        sort(arr);
    }
    public static void sort(int arr[]){
        Map<Integer,Integer> map= new HashMap<>();
        ArrayList<Integer> a= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<map.get(i);j++){
                a.add(i);
            }
        }
        System.out.println(a);
    }
}
