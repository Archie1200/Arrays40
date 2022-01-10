import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class sumPair {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, -1, 5};
        sumpair(arr, 6);
    }

    public static void sumpair(int arr[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(k - arr[i]))
                sum+=map.get(k-arr[i]);
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
                else
                    map.put(arr[i],1);
        }
        System.out.println(sum);
    }
}