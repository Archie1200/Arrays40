import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class merge {
    public static void main(String[] args) {
        int arr1[]= {1,2,3,4};
        int arr2[]={5,6,7,8,9,10};
        merging(arr1,arr2);
    }
    public static void merging(int arr1[],int arr2[]){
        Map<Integer,Boolean> map= new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],true);
        }
        for(int i=0;i<arr2.length;i++){
            map.put(arr2[i],true);
        }
        Iterator<Integer> p =map.keySet().iterator();
        while(p.hasNext()){
            System.out.print(p.next()+" ");
        }
    }
}
//TC:O(nlog(n)+mlog(m))
//SC:O(n)